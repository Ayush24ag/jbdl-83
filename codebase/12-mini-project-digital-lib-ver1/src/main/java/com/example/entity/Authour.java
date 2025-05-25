package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
private String authourName;
}
