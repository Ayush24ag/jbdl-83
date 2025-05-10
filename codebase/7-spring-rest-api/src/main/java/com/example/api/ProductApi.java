package com.example.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Product;
import com.example.service.ProductService;
//@Controller
@RestController//@Controller + @ResponseBody
@RequestMapping("/products")
public class ProductApi {
	@Autowired
	private ProductService service;
	//who can call this function
	   //-Anyclient
	@GetMapping("/test")
	//@ResponseBody
	public String hello() {
		return "Hello GA";
	}
	@GetMapping("/sample")
	//@ResponseBody //client of this method is a sw/diff server not END USER
	public Product testProduct() {
		Product p=new Product();
		p.setProdId(101); p.setProdName("Sample product"); p.setPrice(100);
		return p;
	}
	@GetMapping
	//@ResponseBody
	public List<Product> allProducts(){
		return service.allProducts();
	}
}
