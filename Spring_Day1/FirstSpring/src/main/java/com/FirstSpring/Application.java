package com.FirstSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	//ApplicationContext = BeanFactory = Pharmacy Manufacturer
    public static void main(String[] args) {
		//activate your Spring container.
    	
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    	Patient patientBean = applicationContext.getBean(Patient.class,"patientBean");
    	patientBean.fun();
	}
}
