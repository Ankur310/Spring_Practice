package packageAnkur;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo1 {
    public static void main(String[] args) {
		System.out.println("Hii this is Ankur Singh");
		
		ApplicationContext conn = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Person person = (Person) conn.getBean("person");
		
		System.out.println(person);
	}

}
