package com.masai.question1.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.masai.question1.Employee;
import com.masai.question1.EmployeeRepo;

@Repository
public class EmployeeRepoDAO implements EmployeeRepo{

	@Override
	public void insertEmployeeDetails(Employee emp) {
			
		
	}

	@Override
	public List<Employee> getAllEmployeeDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findEmployee(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteEmployeeDetailsById(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
