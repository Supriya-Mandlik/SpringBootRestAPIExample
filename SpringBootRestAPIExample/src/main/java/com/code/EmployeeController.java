package com.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService emplService;
	
	@Autowired
	EmployeeRepository emprepo;
	
	@RequestMapping(value="/gettemprature" , method=RequestMethod.GET)
	public String getTemprature() {
		
		System.out.println("Here we write a code to return temprature");
		
		return "40c";
		
	}
	
	@RequestMapping(value="/numbercheck/{number}" , method=RequestMethod.GET)
	public String EvenOddNumberCheck(@PathVariable Integer number) { 
		// @PathVariable map the number given in the path(path variable) to the number in method.
		
		System.out.println(number);
		
		if (number%2==0) {
			return "Number is Even";
		} else {
			return "Number is odd";
		}
		
		//return number.toString();
			
	}
	
	@RequestMapping(value="/saveemployee" , method=RequestMethod.POST)
	public String saveEmployeexyz(@RequestBody Employee emp) {
		//@RequestBody map the body of request with the Employee object.
		// the fields of body and the fields of employee class should be same.
		
		emprepo.save(emp);
		
		return "Employee Data Saved SuccessFully !";
		
	}
	
}
