package com.example.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Product;

@RestController
@RequestMapping("/products")
public class ProductApi {
     @Autowired
	 private Environment env;
	@GetMapping("/{id}")
	public Product searchById(@PathVariable("id") int id) {
		String port=env.getProperty("local.server.port");
		if(id==101) {
		Product p1=new Product(101, "T Shirt", 1000, port);
		return p1;
		}
		return null;
	}
}
