package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.model.Product;
@Component
public class ProductServiceImpl implements ProductService {
	List<Product> plist= new ArrayList<>();
	{
		plist.add(new Product(101,"Laptop",50000));
		plist.add(new Product(102,"Earphones",4000));
		plist.add(new Product(103,"Mobile",20000));
		plist.add(new Product(104,"Bottle",500));
		plist.add(new Product(105,"Shoes",2000));
	}
	public List<Product> allProducts() {
		System.out.println("**All Products method called***");
		return plist;
	}
}
