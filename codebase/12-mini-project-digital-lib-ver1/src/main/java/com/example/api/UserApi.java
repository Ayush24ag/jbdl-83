package com.example.api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.entity.User;
import com.example.service.UserService;
@RestController
@RequestMapping("/users")
public class UserApi {
	@Autowired
    private UserService userService;
	@PostMapping
	public User addNewUser(@RequestBody User user) {
		User u=userService.addNewUser(user);
		return u;
	}
}
