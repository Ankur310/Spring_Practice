package com.springOrm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDAO;
import com.spring.orm.entities.Student;

public class Test {

	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		StudentDAO st = context.getBean("StudentDAO",StudentDAO.class);
		
		
		Student student = new Student();
		student.setCity("patna");
		student.setId(1);
		student.setName("Ankur Singh");
		
		st.saveStudent(student);
		
		System.out.println("Done saving data");
	

	}
}

