package com.question1.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Traingle tr = (Traingle) context.getBean("traingle");
		tr.draw();
		
		Circle  cr = (Circle) context.getBean("circle");
		cr.draw();
		
		Cylinder cy = (Cylinder)context.getBean("cylinder");
		cy.draw();

	}

}
