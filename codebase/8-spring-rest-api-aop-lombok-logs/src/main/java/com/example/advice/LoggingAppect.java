package com.example.advice;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class LoggingAppect {
	@Pointcut("execution(* com.example.service.ProductServiceImpl.*(..) )")
	private void myMethod() {
		
	}
	//@Before("execution(* com.example.service.ProductServiceImpl.*(..) )")
	@Before("myMethod()")
	public void log1() {
		System.out.println("****Before Logs****");
	}
	
	//@After("execution(* com.example.service.ProductServiceImpl.*(..) )")
	@After("myMethod()")
	public void log2( ) {
		System.out.println("****After Logs****");
	}
}
