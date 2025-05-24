package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entity.Address;
import com.example.demo.entity.Customer;
import com.example.demo.entity.Employee;
import com.example.demo.entity.Student;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx=
		SpringApplication.run(Application.class, args);
		CustomerRepository repo=ctx.getBean(CustomerRepository.class);
	  /*Customer c=new Customer();//NEW
	  c.setCustId(107);
		c.setCustName("Rajat");
		c.setAddress("Delhi");
		
		repo.addNewCustomer(c);
		//DETACHED
		c.setAddress("Chennai");
		System.out.println("SAVED !!!!");
		//repo.searchById(110);
		 * */
		//repo.updateAddress(102, "Delhi");
		EmployeeRepository empRepo=ctx.getBean(EmployeeRepository.class);
//		Employee e= new Employee();
//		Address addr=new Address();
//		e.setId(105);
//		e.setEmpName("Avneet");
//		
//		addr.setDoorNo("C-89");
//		addr.setPlaceName("Pune");
//		addr.setPinCode(56788);
//		
//		e.setAddress(addr);
		//empRepo.addNewEmployee(e);
	//	empRepo.searchByPlace("Pune");
		
		StudentRepository srepo=ctx.getBean(StudentRepository.class);

//		Address addr1=new Address();
//		addr1.setDoorNo("C-89");
//		addr1.setPlaceName("Pune");
//		addr1.setPinCode(56788);
//		
//		Address addr2=new Address();
//		addr2.setDoorNo("C-1111");
//		addr2.setPlaceName("Mumbai");
//		addr2.setPinCode(56788);
//		List<Address> addrs=new ArrayList<>();
//		addrs.add(addr1);addrs.add(addr2);
//		Student s=new Student();
//		s.setStudId(111);
//		s.setCourse("JAva");
//		s.setStudName("Abhilash");
//		s.setAddress(addrs);
//		srepo.addStudent(s);
		srepo.searchById(111);
		}

}
