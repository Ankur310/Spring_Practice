package com.ankur;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		A a = context.getBean("a", A.class);
		a.signature();
		
		((ClassPathXmlApplicationContext) context).close();

	}
}
