package com.example.demo.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
private int id;
private String empName;
@Embedded
private Address address;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}


}
