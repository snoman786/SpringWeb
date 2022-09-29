package com.noman.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.noman.model.Employee;

public class EmployeeFormValidator implements Validator {

	@Override
	public boolean supports(Class<?> paramClass) {
		return Employee.class.equals(paramClass);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "id.required");
		Employee emp = (Employee) obj;
		if (emp.getId() <= 0) {
			errors.rejectValue("id", "negativeValue", new Object[] { "'id'" },
					"id can't be negative");
		}

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name","name.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "role","role.required");

	}

}
