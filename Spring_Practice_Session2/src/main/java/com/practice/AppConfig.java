package com.practice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.practice"})
public class AppConfig {
	
	@Bean
	public List<String> getFriends(){
		List<String> friends = new ArrayList<String>();
		friends.add("Satyam Singh");
		friends.add("JhunJhun Singh");
		friends.add("Honey Singh");
		return friends;
	}
	

}
