package com.example.demo.repository;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.entity.Address;
import com.example.demo.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
@Component
public class StudentRepository {
	@PersistenceContext
private EntityManager em;
	@Transactional
	public void addStudent(Student s) {
		em.persist(s);
	}
	@Transactional
	public void searchById(int id) {
		//select query will get fired
	 Student s=em.find(Student.class, id);
	 if(s!=null) {
		 System.out.println(s.getStudName());
		 System.out.println(s.getCourse());
		List<Address> addresses=s.getAddress();
		for(Address a:addresses) {
			System.out.println(a.getDoorNo()+" "+a.getPinCode()+" "+a.getPlaceName());
		}
	 }
	}
}
