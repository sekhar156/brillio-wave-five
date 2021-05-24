package com.brillio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brillio.model.Book;
import com.brillio.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookService service;
	
	@PostMapping("/save")
	public Book saveBook(@RequestBody Book book) {
		return service.saveBook(book);
	}
	
	@GetMapping("/get")
	public List<Book> getBook(Book book) {
		return service.getBook();
	}
	
	
	
	
}
