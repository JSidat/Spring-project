package com.bae.starterproject.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bae.starterproject.domain.Book;
import com.bae.starterproject.service.BookService;

@RestController
public class BookController {

	private BookService service;

	public BookController(BookService service) {
		super();
		this.service = service;
	}

	@PostMapping("/create")
	public ResponseEntity<Book> createBook(@RequestBody Book book) {
		return new ResponseEntity<Book>(this.service.createBook(book), HttpStatus.CREATED);
	}

}