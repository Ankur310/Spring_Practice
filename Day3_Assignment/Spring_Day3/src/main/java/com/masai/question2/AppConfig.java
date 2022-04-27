package com.masai.question2;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.masai.question2")
@PropertySource("a1.properties")
public class AppConfig {
   
   @Bean
    public List<String> getStudents(){
	   List<String> stu = new ArrayList<>();
	   stu.add("Ankur");
	   stu.add("Ankit");
	   stu.add("Honey");
	   stu.add("Aman");
	   stu.add("Adiya");
	   stu.add("Ankush");
	   return stu;
	   
   }
}
