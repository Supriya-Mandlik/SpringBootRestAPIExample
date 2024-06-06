package com.code;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {
	
	@Value("${employee.company.name}")
	private String company;
	
	public Employee getEmployee(Employee emp) {
		
		Employee uemp = new Employee();
		
	    uemp.setId(emp.getId().toUpperCase());
		uemp.setName(emp.getName().toUpperCase()+" From "+company);
		uemp.setSalary(emp.getSalary().toUpperCase());
		uemp.setDept(emp.getDept().toUpperCase());
		
		return uemp;
		
	}
	
   public Employee showEmployee(Employee emp) {
		
		Employee uemp = new Employee();
		
	    uemp.setId(emp.getId().toUpperCase());
		uemp.setName(emp.getName().toUpperCase());
		uemp.setSalary(emp.getSalary().toUpperCase());
		uemp.setDept(emp.getDept().toUpperCase());
		
		return uemp;
		
	}

   public Employee deleteEmployee(Employee emp) {
	
	Employee uemp = new Employee();
	
    uemp.setId(emp.getId().toUpperCase());
	uemp.setName(emp.getName().toUpperCase());
	uemp.setSalary(emp.getSalary().toUpperCase());
	uemp.setDept(emp.getDept().toUpperCase());
	
	return uemp;
	
}

}
