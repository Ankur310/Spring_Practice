package com.example.demo.Exceptions;

import java.time.LocalDateTime;

public class MyErrorDetails {

	private LocalDateTime time;
	private String message;
	private String details;

	public MyErrorDetails(LocalDateTime time, String message, String details) {
		super();
		this.time = time;
		this.message = message;
		this.details = details;
	}

	public MyErrorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

}
