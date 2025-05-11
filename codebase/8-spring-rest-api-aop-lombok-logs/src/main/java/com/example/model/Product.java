package com.example.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@XmlRootElement
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
 private int prodId;
 @NotBlank(message = "please enter the prod name")
 private String prodName;
 @Min(value = 0,message = "prize cannot be negative")
 private float price;
  
}
