package com.example.dto;

import java.time.LocalDate;

import com.example.entity.Authour;
import com.example.entity.Genre;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookDto {
	private int bookId;
	private String bookName;
	@JsonFormat(pattern = "dd-MM-yyyy")//for client
	private LocalDate publishedDate;
	private float cost;
	private int stock;
	@Enumerated(EnumType.STRING)
	private Genre genre;
	private int authourId;
}
