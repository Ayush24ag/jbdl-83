package com.example.api;

import org.springframework.context.annotation.Fallback;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
public class CircuitBreakerController {
 @GetMapping("/test")
//try to reconnect automatically for 3 times in default
//@Retry(name="default") //for temp shut down
 //@Retry(name="my-api",fallbackMethod ="fallBackMethod"  )
 //for permanent shut down use  this
 @CircuitBreaker(name="my-api" ,fallbackMethod = "fallBackMethod")
	public String test() {
	RestTemplate template=new RestTemplate();
	String fakeUrl="http://www.abcfakeurl.com";
	System.out.println("Trying to connect "+fakeUrl);
	String resp=template.getForObject(fakeUrl, String.class);
		return resp;
	}
 public String fallBackMethod(Exception e) {
	 return "Server down pls try after some time ....";
 }
}
