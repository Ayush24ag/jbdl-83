package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.example.dto.BookDto;
import com.example.entity.Authour;
import com.example.entity.Book;
import com.example.entity.Genre;
import com.example.repository.AuthourRepository;
import com.example.repository.BookRepository;
@Component
public class BookServiceImpl implements BookService {
	@Autowired
	private AuthourRepository authourRepo;
	@Autowired
	private BookRepository bookRepo;
	@Override
	public Book addBook(BookDto bookDto) {
		int authourId=bookDto.getAuthourId();
	  Authour authour=authourRepo.findById(authourId).get();
	  Book book= new Book();
	  //from dto to book copy all properties
	  book.setBookId(bookDto.getBookId());
	  book.setBookName(bookDto.getBookName());
	  book.setCost(bookDto.getCost());
	  book.setStock(bookDto.getStock());
	  book.setGenre(bookDto.getGenre());
	  book.setPublishedDate(bookDto.getPublishedDate());
	  book.setAuthourId(authour);
	  
		return bookRepo.save(book);
	}

	public Authour addAuthour(Authour authour) {
		return authourRepo.save(authour);
	}
	public List<Book> searchByGenre2(Genre genre) {
		return null;
	}
	public List<Book> allBooks() {
		return null;
	}

	@Override
	public Page<Book> allBookswithPagination(int pageNo, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> searchByAuthour(int authourId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> searchByGenre(Genre genre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeBook(int bookId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Book> searchByBookName(String bookName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateCost(int bookId, float cost) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
