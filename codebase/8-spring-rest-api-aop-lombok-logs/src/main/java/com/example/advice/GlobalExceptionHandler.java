package com.example.advice;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.exception.ProductNotFoundException;
@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(ProductNotFoundException.class)
	public   ResponseEntity<String> handleProductNotFoundException(ProductNotFoundException e) {
		System.out.println("Exception handled ...");
		//return "un excepted Error occured";
		return new ResponseEntity<> (e.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, String>> handleValidationException
	(MethodArgumentNotValidException e){
		Map<String, String> errorsMap=new HashMap<>();
	  //List<FieldError>	error=  e.getFieldErrors();
		e.getFieldErrors().forEach(err->errorsMap.put(err.getField(), err.getDefaultMessage()));
		return new ResponseEntity<Map<String,String>>(errorsMap,HttpStatus.BAD_REQUEST);
	}
}
