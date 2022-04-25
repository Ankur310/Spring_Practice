package com.question1.si;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context= new  ClassPathXmlApplicationContext("applicationContext.xml");
		
		TraingleSi tr = (TraingleSi)context.getBean("trSi");
	    tr.draw();
	    
	    CircleSi ci = (CircleSi)context.getBean("ciSi");
	    ci.draw();
	    
	    CylinderSi cy = (CylinderSi)context.getBean("cySi");
	    cy.draw();
	    
	}
	

}
