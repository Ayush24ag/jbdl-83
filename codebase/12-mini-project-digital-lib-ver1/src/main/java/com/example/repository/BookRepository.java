package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Book;
import com.example.entity.Genre;

public interface BookRepository extends JpaRepository<Book,Integer>{
	List<Book> findByGenre(Genre genre);
}
