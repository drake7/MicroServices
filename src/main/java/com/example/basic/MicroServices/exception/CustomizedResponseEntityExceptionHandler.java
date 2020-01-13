package com.example.basic.MicroServices.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.basic.MicroServices.Users.UserNotFoundException;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler 
{

	@ExceptionHandler(Exception.class)
	public final  ResponseEntity<Object> allExceptionHandling(Exception ex,WebRequest wr)
	{
	ExceptionResponse excR=	new ExceptionResponse(new Date(),ex.getMessage(),
			wr.getDescription(false));
	
		return new ResponseEntity(excR,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	@ExceptionHandler(UserNotFoundException.class)
	public final  ResponseEntity<Object> UserNotFoundExceptionHandling(UserNotFoundException ex,WebRequest wr)
	{
	ExceptionResponse excR=	new ExceptionResponse(new Date(),ex.getMessage(),
			wr.getDescription(false));
	
		return new ResponseEntity(excR,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
}
