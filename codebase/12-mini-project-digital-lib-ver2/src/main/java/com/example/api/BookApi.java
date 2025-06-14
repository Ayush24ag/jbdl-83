package com.example.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.BookDto;
import com.example.entity.Authour;
import com.example.entity.Book;
import com.example.entity.Genre;
import com.example.service.BookService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/books")
public class BookApi {
	@Autowired
	private BookService bookService;
	@PostMapping("/authours")
	public  ResponseEntity<Authour> addNewAuthour(@RequestBody @Valid  Authour authour) {
		Authour auth=  bookService.addAuthour(authour);
		return new ResponseEntity<Authour>(auth,HttpStatus.CREATED);
	}
	@PostMapping //by admin
	public Book addNewBook(@RequestBody @Valid  BookDto bookDto) {
		//if the user is admin else throw error
		return bookService.addBook(bookDto);
	}
	@GetMapping("/{bookId}")
	public Book searchById(@PathVariable("bookId") int bookId) {
		return bookService.searchBookById(bookId);
	}
	@GetMapping
	public List<Book> allBooks(){ //user & admin
		//if the user is admin or user else throw error
		return bookService.allBooks();
	}
	@GetMapping("/search/genre")
	public List<Book> searchByGenre( @RequestParam("genre") Genre genre) {
		return bookService.searchByGenre(genre);
	}
	@GetMapping("/page")
	public List<Book> allBooksWithPagination( @RequestParam("pageNo") int pageNo,
			@RequestParam("size")  int size){
		Page<Book> bookPage=bookService.allBookswithPagination(pageNo, size);
		return bookPage.toList();
	}
}
