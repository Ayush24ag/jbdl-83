package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data //autogenerates getter and setter
@NoArgsConstructor
@AllArgsConstructor
public class Department {
	@Id
private int deptId;
private String deptName;

}
