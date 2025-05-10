package com.geek.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.geek.controller.AccountController;
import com.geek.repo.AccRepImpl;
import com.geek.service.AccountServiceImpl;
//replace the xml
@ComponentScan(basePackages = "com.geek")
public class SpringConfig {
	@Bean("accController") //resembles <Bean>
	public AccountController getAccController() {
		return new AccountController();
	}
	@Bean //resembles <Bean>
	public AccountServiceImpl getAccService() {
		return new AccountServiceImpl();
	}
}
