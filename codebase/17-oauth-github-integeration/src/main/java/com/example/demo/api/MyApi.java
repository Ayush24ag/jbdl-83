package com.example.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyApi {
	@GetMapping("/hello")
 public String hello() {
	 return "Hello";
 }
}
