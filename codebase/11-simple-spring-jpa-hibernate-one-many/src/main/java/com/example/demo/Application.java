package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entity.Department;
import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepository;
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		ApplicationContext ctx=
		SpringApplication.run(Application.class, args);
	//	Department d=new Department(1001, "IT");
		EmployeeRepository empRepo=ctx.getBean(EmployeeRepository.class);
		//empRepo.addNewDepartment(d);
		Employee e=new Employee();
		e.setEmpName("Adarsh");
		empRepo.addNewEmployee(e, 1001);
	}
}
