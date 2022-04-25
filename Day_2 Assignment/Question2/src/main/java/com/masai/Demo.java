package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
		
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	sum s = context.getBean("sum",sum.class);
    	System.out.println(s.sum());
    	
    	
    	Substraction sub = context.getBean("subs",Substraction.class);
    	System.out.println(sub.substract());
    	
    	
    	Multiplication m = context.getBean("multiply",Multiplication.class);
    	System.out.println(m.multiply());
    	
    	Division d = context.getBean("divide",Division.class);
    	System.out.println(d.divide());
	}
}
