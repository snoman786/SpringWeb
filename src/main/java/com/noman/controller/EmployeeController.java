package com.noman.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.noman.model.Employee;

@Controller
@RequestMapping(value = "/employee")
public class EmployeeController {

	@Autowired
	@Qualifier("employeeValidator")
	private Validator validator;
	
	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView getEmpPage(Map<String, Object> model) {
		Employee employee = new Employee();
		model.put("employee", employee);
		return new ModelAndView("employeeform");
	}

	@RequestMapping(method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("employee") @Validated Employee employee,BindingResult result,Map<String, Object> map) {
		if(result.hasErrors()){
			return "employeeform";
		}
		System.out.println("House Number is" + employee.getAddress().gethNo());
		System.out.println("Street Name is" + employee.getAddress().getStreet());
		map.put("alias2", employee);
		return "empResult";
	}
}
