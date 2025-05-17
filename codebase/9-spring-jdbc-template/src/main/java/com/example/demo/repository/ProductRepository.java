package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.model.Product;
@Component
public class ProductRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;
 public void addNewProduct(Product p) {
	 //interact with Database and store product data in products table....
	 String sql="insert into products values (?, ?, ?)";
	 jdbcTemplate.update(sql, p.getProdId(),p.getProdName(),p.getPrice());
 }
 public void updateProduct (Product p) {
	 String sql="update products set prodName=?, price=? where prodId=?";
	 jdbcTemplate.update(sql,p.getProdName(),p.getPrice(),p.getProdId());
 }
 public List<Product> readAllProducts(){
	 String sql="select * from products";
	 List<Product> plist=
			 jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Product.class));
	 return plist;
 }
}
