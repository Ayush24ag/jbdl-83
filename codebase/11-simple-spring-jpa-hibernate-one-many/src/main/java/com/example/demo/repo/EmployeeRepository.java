package com.example.demo.repo;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Department;
import com.example.demo.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Component
public class EmployeeRepository {
	@PersistenceContext
private EntityManager em;
	@Transactional
	public void addNewDepartment(Department d) {
		em.persist(d);
	}
	@Transactional
	public void addNewEmployee(Employee e, int deptId) {
		//to add a new emp, need to map with the dept
		//shud not create a new emp
		//shud add existing dept
		Department d=em.find(Department.class, deptId);
		if(d!=null) {
			e.setDept(d);//itss important
			em.persist(e);//persist the emp
			System.out.println("emp added");
		}
		else
			System.out.println("dept not exists");
	}
}
