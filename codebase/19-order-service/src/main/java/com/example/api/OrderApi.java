package com.example.api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.example.model.Order;
import com.example.proxy.ProductServiceProxy;
@RestController
@RequestMapping("/orders")
public class OrderApi {
	@Autowired
	private RestTemplate restTemplate;
	@PostMapping("/{pid}/{q}")
	public Order orderProduct(@PathVariable("pid")  int pid,@PathVariable("q")  int q) {
		RestTemplate template= new RestTemplate();
	String url="http://localhost:8000/products/"+pid;
		//String url="http://product-service/products/"+pid;
		Order order=template.getForObject(url, Order.class);
		return order;
	}
	
	@PostMapping("/loadbal/{pid}/{q}")
	public Order orderProductLoadBal(@PathVariable("pid")  int pid,@PathVariable("q")  int q) {
		String url="http://product-service/products/"+pid;
		Order order=restTemplate.getForObject(url, Order.class);
		return order;
	}
	@Autowired
	private ProductServiceProxy productService;
	@PostMapping("/feign/{pid}/{q}")
	public Order orderProductFeigj(@PathVariable("pid")  int pid,@PathVariable("q")  int q) {
		//here u r calling this method....it looks a normal method call
		//not look like a api call
		Order order=productService.getProduct(pid);
		return order;
	}
}
