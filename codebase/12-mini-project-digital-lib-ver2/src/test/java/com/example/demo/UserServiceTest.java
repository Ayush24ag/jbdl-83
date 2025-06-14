package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.entity.Book;
import com.example.entity.Transaction;
import com.example.repository.BookRepository;
import com.example.repository.TransactionRepository;
import com.example.service.UserServiceImpl;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    @Mock
	private BookRepository bookRepo;
    @Mock
    private TransactionRepository transRepo;
    @InjectMocks //class under test, all mocks to be injected here
    private UserServiceImpl userService;
     @Test
    public void checkAvailabilityBookTest() {
    	Book mockBook=new Book();
    	mockBook.setBookId(101);
    	mockBook.setStock(1);
    	//findById(101) returns Optional<Book>
    	//Optional.of(mockBook) --> returns Optional<Book>
    	//PRE-CONDITION
    	when(bookRepo.findById(101)).thenReturn(Optional.of(mockBook));
    	
    	boolean status=userService.checkAvailability(101);
    	assertEquals(true, status);
    	
    	//to ensure service invoked bookRepo.findById() one time  
    	verify(bookRepo,times(1)).findById(101);
    }
     
     @Test
     public void returnBookWithoutPenalty() {
    	 Transaction mockTransaction=new Transaction();
    	 mockTransaction.setTid(1);
    	 mockTransaction.setBorrowedDate(LocalDate.of(2025, 5, 10));
    	 mockTransaction.setStatus("BORROWED");
    	 Book mockBook=new Book();
     	mockBook.setBookId(101);
     	mockBook.setStock(1);
     	
     	mockTransaction.setBook(mockBook);
     	//PRE-CONDITION ....
    	 when(transRepo.findById(1)).thenReturn(Optional.of(mockTransaction));
    	 //
    	Book b= userService.returnBook(1);
    	assertEquals(2, b.getStock());
    	assertEquals("RETURNED", mockTransaction.getStatus());
    	//verify ....
     }
     @Test
     public void returnBookWithPenalty() {
     }
     
}
