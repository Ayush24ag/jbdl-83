package com.example.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.BookDto;
import com.example.entity.Authour;
import com.example.entity.Book;
import com.example.service.BookService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/books")
public class BookApi {
	@Autowired
	private BookService bookService;
	@PostMapping("/authours")
	public Authour addNewAuthour(@RequestBody @Valid  Authour authour) {
		return bookService.addAuthour(authour);
	}
	@PostMapping
	public Book addNewBook(@RequestBody @Valid  BookDto bookDto) {
		return bookService.addBook(bookDto);
	}
	
}
