package com.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Person person = context.getBean("person",Person.class);
		System.out.println(person);
		//System.out.println(person.getFriends());
		
		System.out.println(person.hashCode());
		
		
		
		Person person1 = context.getBean("person",Person.class);
		System.out.println(person1);
	    System.out.println(person1.hashCode());
	}
}
