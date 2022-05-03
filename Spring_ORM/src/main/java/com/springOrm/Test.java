package com.springOrm;

import java.util.List;

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
		
		
		Student student2 = new Student(2,"Satyam Singh","Delhi");
		Student student3 = new Student(3,"Honey Singh","punjab");
		
		
		st.saveStudent(student);
		st.saveStudent(student2);
		st.saveStudent(student3);
		
		System.out.println("Done saving data");
		
		List<Student> st2 = st.getAllStudent();
		
		for(Student stu : st2) {
			System.out.println(stu);
		}
		
		st.removeStudent(2);
		
		student3.setCity("Bihar");
		st.updateStudent(student3);
	

	}
}

