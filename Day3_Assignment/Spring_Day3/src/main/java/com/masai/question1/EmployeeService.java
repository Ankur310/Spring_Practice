package com.masai.question1;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
	public Employee saveEmployee(Employee emp);
	public List<Employee> getAllEmployee();
	public Employee getEmployeeById(int empId)throws EmployeeException;
	public String deleteEmployeeById(int empId)throws EmployeeException;

}
