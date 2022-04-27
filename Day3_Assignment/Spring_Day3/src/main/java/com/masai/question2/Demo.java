package com.masai.question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Demo {

	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		PracticalShow pr = context.getBean("pra",PracticalShow.class);
		System.out.println(pr.getCities());
		
		System.out.println(pr.getStudents());
		
	    ((AbstractApplicationContext) context).close();
	}
}
