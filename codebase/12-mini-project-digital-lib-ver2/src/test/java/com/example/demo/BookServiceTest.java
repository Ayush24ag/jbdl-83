package com.example.demo;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.dto.BookDto;
import com.example.entity.Authour;
import com.example.entity.Book;
import com.example.entity.Genre;
import com.example.repository.AuthourRepository;
import com.example.repository.BookRepository;
import com.example.service.BookServiceImpl;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {
	@Mock
	private AuthourRepository authourRepo;
	@Mock
	private BookRepository bookRepo;
  @InjectMocks
	private BookServiceImpl bookService;
	@Test
	public void addBookTest() {
		Authour mockAuthour= new Authour();
		mockAuthour.setAuthourId(1);
		mockAuthour.setAuthourName("ABCD");
	  BookDto bookDto=new BookDto();
	  bookDto.setAuthourId(1);
	  bookDto.setBookId(101);
	  bookDto.setBookName("Test Book");
	  bookDto.setCost(100);
	  bookDto.setGenre(Genre.COMEDY);
	  bookDto.setStock(50);
	  bookDto.setPublishedDate(LocalDate.now());
		when(authourRepo.findById(1)).thenReturn(Optional.of(mockAuthour));
		bookService.addBook(bookDto);
		verify(authourRepo,times(1)).findById(1);
		verify(bookRepo,times(1)).save(any(Book.class ));
	}
}
