package com.masai.question1.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.question1.Employee;
import com.masai.question1.EmployeeException;
import com.masai.question1.EmployeeService;


@Service
public class EmployeeServiceDAO implements EmployeeService{
    @Autowired
	List<Employee> employee = new ArrayList<>();
	
	@Override
	public Employee saveEmployee(Employee emp) {
		employee.add(emp);
		return emp;
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return employee;
	}
	

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		Employee empl = null;
		for(int i=0; i<employee.size(); i++) {
			if(employee.get(i).getEmpId() == empId) {
				empl = employee.get(i);
			}
		}
		return empl;
	}
	

	@Override
	public String deleteEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		String message = "Employee Doesn't Exist";
		for(int i=0; i<employee.size(); i++) {
			if(employee.get(i).getEmpId() == empId) {
				employee.remove(i);
				message = "Deleted Successfully";
		    }
		}
		
		return message;
	}
	

}
