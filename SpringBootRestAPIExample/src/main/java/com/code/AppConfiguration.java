package com.code;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//@Configuration
public class AppConfiguration {
	
	/*
	 * In this configuration class i create a bean of employee service class so that i can autowire it.
	 * */
	
	//@Bean
	public EmployeeService createEmployeeService() {
		
		EmployeeService service = new EmployeeService();
		
		return service;
		
	}
	

}
