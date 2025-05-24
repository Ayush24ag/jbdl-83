package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.entity.Address;
import com.example.demo.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Component
public class EmployeeRepository {
	@PersistenceContext
	private EntityManager em;
	@Transactional
public void addNewEmployee(Employee e) {
	em.persist(e);
}
	
public void searchEmpById(int id) {
	Employee e=  em.find(Employee.class, id);
	if(e!=null) {
		System.out.println(e.getEmpName());
		Address addr=e.getAddress();
		System.out.println(addr.getDoorNo()+" "+addr.getPlaceName()+" "+addr.getPinCode());
	}
	else {
		System.out.println("Record not exists");
	}
}

public void allEmps() {
	String jpql="select emp from Employee emp"; //java persistence query lang
	Query q=   em.createQuery(jpql);
	List<Employee>  empList= q.getResultList();
	empList.forEach(e-> System.out.println(e.getEmpName()+" "+e.getAddress().getPlaceName()));
}
public void searchByPlace(String place) {
	//:paramname
	String jpql="select emp from Employee emp where emp.address.placeName = :pl"; //java persistence query lang
	Query q=   em.createQuery(jpql);
	q.setParameter("pl", place);
	List<Employee>  empList= q.getResultList();
	empList.forEach(e-> System.out.println(e.getEmpName()+" "+e.getAddress().getPlaceName()));

}
}
