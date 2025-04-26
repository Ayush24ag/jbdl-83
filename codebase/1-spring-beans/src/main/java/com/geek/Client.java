package com.geek;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Client {
	public static void main(String[] args) {
	ApplicationContext ctx= 
			new ClassPathXmlApplicationContext("beans.xml");
	System.out.println("spring intialized");
	GreetingBean bean=  (GreetingBean) ctx.getBean("greet");
	System.out.println(bean.sayHello("Albin"));
	
	GreetingBean bean2=  (GreetingBean) ctx.getBean("greet");
	System.out.println(bean==bean2); //chking memory
	}
}
