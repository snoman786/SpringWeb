package com.noman.model;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import com.noman.validator.Phone;

public class Student {

	@Range(min = 2, max = 150) 
	private Integer age;
	@NotEmpty
	private String name;
	@Email
	private String emailId ;
    private String profession;
    
    @Phone
    // This field has to get validated by our own validator 
    // NOT provided by hibernate or JSR303.
    private String phoneNumber;
    
    @DateTimeFormat(pattern="MM/dd/yyyy")
    @NotNull @Past
    private Date birthday;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}	
	
}
