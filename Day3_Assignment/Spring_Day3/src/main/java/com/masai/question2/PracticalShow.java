package com.masai.question2;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service(value = "pra")
public class PracticalShow {
    @Autowired
	private Environment env;
    
    @Autowired
    List<String> students;
    
    @PreDestroy
    public void displayDestroy() {
    	System.out.println("This is destroy method called by PracticalClass");
    }
    
    @PostConstruct
    public void displayCostruct() {
    	System.out.println("This is the construct methos of PraciticalClass");
    }
	
	
	
	public List<String> getCities(){
		List<String> cities = new ArrayList<>();
		cities.add(env.getProperty("db.city1"));
		cities.add(env.getProperty("db.city2"));
		cities.add(env.getProperty("db.city3"));
		cities.add(env.getProperty("db.city4"));
		cities.add(env.getProperty("db.city5"));
		return cities;
	}
	
	public List<String> getStudents(){
		return students;
	}
}
