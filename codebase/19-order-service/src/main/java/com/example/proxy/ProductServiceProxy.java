package com.example.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.model.Order;
//Assume its a existing code.....
@FeignClient(name = "product-service")//with load balancer
//@FeignClient(name = "anyname",url = "http://localhost:8000")//without load balancer
public interface ProductServiceProxy { 
	@GetMapping("/products/{pid}")
	Order getProduct( @PathVariable("pid") int  pid);
}
