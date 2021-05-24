package com.brillio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brillio.model.Book;
import com.brillio.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository repository;
	
	public  Book saveBook(Book book) {
		return repository.save(book);
	}
	
	public List<Book> getBook() {
		return repository.findAll();
	}
	
	
}
