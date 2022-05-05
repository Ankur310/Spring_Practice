package com.example.demo;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class MainExceptionHandlerClass {

	
	@ExceptionHandler(IllegalArgumentException.class)
	public static void getError(HttpServletResponse response, IllegalArgumentException illex) throws IOException {
		
		System.out.println("This is under getError method");
		response.sendError(HttpStatus.NOT_ACCEPTABLE.value(), illex.getMessage());
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public static ResponseEntity<CustomError> noSuchURL(NoHandlerFoundException exp, WebRequest webr){
		
		CustomError res = new CustomError(LocalDate.now(), exp.getMessage(), webr.getDescription(false));
		
		return new ResponseEntity<>(res, HttpStatus.BAD_GATEWAY);
		
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public static ResponseEntity<CustomError> savingProductError(MethodArgumentNotValidException mve){
		
		
		CustomError custom = new CustomError(LocalDate.now(), "Not a valid value", mve.getBindingResult().getFieldError().getDefaultMessage());
		
		return new ResponseEntity<>(custom, HttpStatus.EXPECTATION_FAILED);
	}
	
	
}
