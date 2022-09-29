package com.noman.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.noman.model.Student;

@Controller
@RequestMapping(value = "/register")
public class FormSubmissionController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView getStudent(Map<String, Object> model) {
		Student student = new Student();
		model.put("student",student);
		
		List<String> professionList = new ArrayList<>();
        professionList.add("Developer");
        professionList.add("Designer");
        professionList.add("IT Manager");
        model.put("professionList", professionList);
        
		//return new ModelAndView("myform","xyz", new Student());
        return new ModelAndView("studentform");
	}

	@RequestMapping(method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("student") @Valid Student student,BindingResult result,Map<String, Object> map) {
		if(result.hasErrors()){
			return "studentform";
		}
		System.out.println("Oopsie" + student.getProfession());
		System.out.println("Name" + student.getName());
//		model.addAttribute("name", student.getName());
//		model.addAttribute("age", student.getAge());
//		model.addAttribute("Email", student.getEmailId());
//		model.addAttribute("BirthDate", student.getBirthDate());
//		model.addAttribute("Profession", student.getProfession());
		map.put("alias", student);
		return "result";
	}
}
