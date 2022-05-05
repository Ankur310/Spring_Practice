package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@SpringBootApplication
public class SpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppApplication.class, args);
	
	}
	
	@Bean
	public static LocalValidatorFactoryBean localValidator(MessageSource msource){
		LocalValidatorFactoryBean lvb = new LocalValidatorFactoryBean();
		lvb.setValidationMessageSource(msource);
		
		return lvb;
	}

}
