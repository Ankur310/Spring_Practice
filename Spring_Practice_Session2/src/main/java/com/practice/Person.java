package com.practice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

///Scope of Bean class.
//1. Singleton => singleton means that u can get the same object whenever u will create objects of that class.
//2. Prototype => prototype means that u can get different every time when u will create objects of the class.
@Scope("prototype")
public class Person {
	
	@Value("1")
	private int personId;
	
	@Value("Ankur Singh Honey")
	private String personName;
	
	@Autowired
	private List<String> friends;
	
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", friends=" + friends + "]";
	}
	
	


	
}
