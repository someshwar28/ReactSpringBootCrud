package com.example.ReactSpringBootMaterialUi.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFound.class)
	public String handleResourceNotFoundException(ResourceNotFound ex) {
		
		return ex.getMessage();
		
	}

}
