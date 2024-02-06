package com.irs.springbootmapstructexample.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.irs.springbootmapstructexample.dto.BookDto;
import com.irs.springbootmapstructexample.services.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

	private final BookService bookService;

	public BookController(final BookService bookService) {
		super();
		this.bookService = bookService;
	}

	@GetMapping("/{id}")
	public ResponseEntity<BookDto> getById(@PathVariable(value = "id") Integer id) {
		return new ResponseEntity<>(bookService.findById(id), HttpStatus.OK);
	}
}
