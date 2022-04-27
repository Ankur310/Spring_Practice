package com.masai.question1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	@Value("patna")
    private String city;
	@Value("India")
    private String country;
	@Value("Bihar")
    private String state;
	@Value("12345")
    private int pincode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String city, String country, String state, int pincode) {
		super();
		this.city = city;
		this.country = country;
		this.state = state;
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", state=" + state + ", pincode=" + pincode + "]";
	}
    
    
    
}
