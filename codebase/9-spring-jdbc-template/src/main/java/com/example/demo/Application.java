package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		ApplicationContext ctx=
		SpringApplication.run(Application.class, args);
		Product p=new Product(102, "T Shirt", 1100);
		ProductRepository repo=ctx.getBean(ProductRepository.class);
	//	repo.addNewProduct(p);
		//repo.updateProduct(p);
	 List<Product> products= repo.readAllProducts();
	 for(Product product:products) {
		 System.out.println(product.getProdId()+" "+product.getProdName()+" "+p.getPrice());
	 }
		//System.out.println("Product Saved !!!!");
	}

}
