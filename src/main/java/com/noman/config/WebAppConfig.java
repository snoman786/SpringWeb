package com.noman.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.noman.validator.EmployeeFormValidator;

@Configuration
@ComponentScan("com.noman.controller")
@EnableWebMvc
public class WebAppConfig {
	
	@Bean
	public InternalResourceViewResolver setupViewResolver() {
		
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);
		
		return resolver;
	}
	
	@Bean
	@Qualifier("employeeValidator")
	public  EmployeeFormValidator employeeValidator(){
		com.noman.validator.EmployeeFormValidator validator = new com.noman.validator.EmployeeFormValidator();
		return validator;
	}
	
	@Bean
	public ResourceBundleMessageSource setMessageResource(){
		ResourceBundleMessageSource resource = new ResourceBundleMessageSource();
		resource.setBasename("messages");
		resource.setDefaultEncoding("UTF-8");
		return resource ;
		
	}

}
