package com.masai.question1;

import java.util.List;

import org.springframework.stereotype.Service;


@Service
public interface EmployeeRepo {
	public void insertEmployeeDetails(Employee emp);
	public List<Employee> getAllEmployeeDetails();
	
	public Employee findEmployee(int empId);
	public String deleteEmployeeDetailsById(int empId);

}
