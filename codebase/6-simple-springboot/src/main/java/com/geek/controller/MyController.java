package com.geek.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.geek.service.MyService;
@RestController//will discuss abt this later
public class MyController {
	@Autowired
	private MyService myservice;
	@GetMapping("/hello")
	public String test() {
		return myservice.hello();
	}
}
