package com.geek;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.geek.config.SpringConfig;
import com.geek.controller.AccountController;

public class Client {
public static void main(String[] args) {
	ApplicationContext ctx= new AnnotationConfigApplicationContext(SpringConfig.class);
	System.out.println("spring initialized...");
	AccountController controller= (AccountController) ctx.getBean("accController");
	System.out.println(controller.creditSal(100000));
}
}
