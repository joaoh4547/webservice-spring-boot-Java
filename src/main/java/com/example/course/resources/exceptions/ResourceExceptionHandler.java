package com.example.course.resources.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.course.services.exceptions.DatabaseException;
import com.example.course.services.exceptions.ResourceNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler  {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException ex,HttpServletRequest req){
		String error = "Resource not found";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError standardError = new StandardError(Instant.now(),status.value(),error,ex.getMessage(),req.getRequestURI());
		
		return ResponseEntity.status(status).body(standardError);
	}
	
	@ExceptionHandler(DatabaseException.class)
	public ResponseEntity<StandardError> database(DatabaseException ex,HttpServletRequest req){
		String error = "Database error";
		HttpStatus status = HttpStatus.BAD_REQUEST;
		StandardError standardError = new StandardError(Instant.now(),status.value(),error,ex.getMessage(),req.getRequestURI());
		
		return ResponseEntity.status(status).body(standardError);
	}
	
	
}
