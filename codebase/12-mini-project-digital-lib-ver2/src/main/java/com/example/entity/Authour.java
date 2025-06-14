package com.example.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data//for setter & getter
@NoArgsConstructor
@AllArgsConstructor
public class Authour {
	@Id
private int authourId;
	@NotNull(message="plz enter authour name")
	@NotBlank(message="authour name cant be blank")
private String authourName;
	
//@OneToMany//here it create another table
  //which has the mapping
//But Book class have the FK (many to one)
//So here 3rd is req or not req
	
@OneToMany(mappedBy = "authourId")	
//here it understand that other side hv  the ref
//which responsible to create FK
private List<Book> books;
}
