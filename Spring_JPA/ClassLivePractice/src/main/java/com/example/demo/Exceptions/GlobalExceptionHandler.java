package com.example.demo.Exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

	
	@ExceptionHandler(StudentException.class)
	public ResponseEntity<MyErrorDetails> handleStudentException(StudentException stex, WebRequest req){
		
		MyErrorDetails myerr = new MyErrorDetails(LocalDateTime.now(), stex.getMessage(), req.getDescription(false));
		return new ResponseEntity<>(myerr,HttpStatus.NOT_FOUND);
	}
}
