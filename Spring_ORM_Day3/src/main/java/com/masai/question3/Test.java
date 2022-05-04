package com.masai.question3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.masai.question3.DAO.EmployeeDAO;
import com.springOrm.Entities.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		EmployeeDAO empDAO = context.getBean("EmployeeDAO",EmployeeDAO.class);
		
		Employee emp1 = new Employee();
		emp1.setEmpId(1);
		emp1.setEmpName("Ankur Singh");
		emp1.setSalary(10000);


		
		
		empDAO.saveEmployee(emp1);
		
	}

}
