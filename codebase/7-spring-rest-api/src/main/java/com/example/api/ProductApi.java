package com.example.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.exception.ProductNotFoundException;
import com.example.model.Product;
import com.example.service.ProductService;

import jakarta.validation.Valid;
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
	@GetMapping(value="/sample",produces = {"application/json","application/xml"})
	//@ResponseBody //client of this method is a sw/diff server not END USER
	public Product testProduct() {
		Product p=new Product();
		p.setProdId(101); p.setProdName("Sample product"); p.setPrice(100);
		return p;
	}
	@GetMapping	//@ResponseBody
	public List<Product> allProducts(){
		return service.allProducts();
	}
	@PostMapping
	public ResponseEntity<Product> addNewProduct( @RequestBody @Valid  Product p) {
		List<Product> products=service.allProducts();
		products.add(p);
		return new ResponseEntity<Product>(p, HttpStatus.CREATED);
	}
	@GetMapping("/{prodId}")
	public Product searchById(@PathVariable("prodId") int id) {
		List<Product> plist =service.allProducts();
		  Optional<Product> optional=  
				plist.stream().filter(p->p.getProdId()==id).findFirst();
		  if(optional.isPresent())
			  return optional.get();
		throw new ProductNotFoundException("Product "+id+" not found");
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id")  int id) {
		//delete the respective product from collection
	}
	@PutMapping("/{id}")
	public Product update( @RequestBody Product p, @PathVariable("id")  int id) {
		//update the corresponding product 
		return null;
	}
}
