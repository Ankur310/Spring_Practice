package com.example.demo;

import java.time.LocalDate;

public class CustomError {
	
	private LocalDate localdate;
	private String message;
	private String errorDetails;
	public CustomError(LocalDate localdate, String message, String errorDetails) {
		super();
		this.localdate = localdate;
		this.message = message;
		this.errorDetails = errorDetails;
	}
	public CustomError() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LocalDate getLocaldate() {
		return localdate;
	}
	public void setLocaldate(LocalDate localdate) {
		this.localdate = localdate;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getErrorDetails() {
		return errorDetails;
	}
	public void setErrorDetails(String errorDetails) {
		this.errorDetails = errorDetails;
	}
	
	
	
	
}
