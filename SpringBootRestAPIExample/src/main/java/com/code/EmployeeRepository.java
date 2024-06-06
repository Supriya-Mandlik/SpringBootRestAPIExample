package com.code;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, String> {
	
	// if we create Repository then there is no need to create session factory, session for crud operations.

}
