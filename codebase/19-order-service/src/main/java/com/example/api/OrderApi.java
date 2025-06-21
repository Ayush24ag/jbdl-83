package com.example.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.model.Order;

@RestController
@RequestMapping("/orders")
public class OrderApi {

	@PostMapping("/{pid}/{q}")
	public Order orderProduct(@PathVariable("pid")  int pid,@PathVariable("q")  int q) {
		RestTemplate template= new RestTemplate();
		String url="http://localhost:8000/products/"+pid;
		Order order=template.getForObject(url, Order.class);
		return order;
	}
}
