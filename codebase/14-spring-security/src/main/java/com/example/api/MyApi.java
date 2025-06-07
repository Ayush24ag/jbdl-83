package com.example.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyApi {
     @GetMapping("/home/user")
	 public String hello() {
    	 //security --> cross cutting concern
		 return "HELLO USER";
	 }
     @GetMapping("/home/admin")
     public String admin() {
    	 //security --> cross cutting concern

    	 return "HELLO ADMIN";
     }
}
