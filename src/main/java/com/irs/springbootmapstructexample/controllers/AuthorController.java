package com.irs.springbootmapstructexample.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.irs.springbootmapstructexample.dto.AuthorAllDto;
import com.irs.springbootmapstructexample.services.AuthorService;

@RestController
@RequestMapping("/authors")
public class AuthorController {

	private final AuthorService authorService;

	public AuthorController(final AuthorService authorService) {
		super();
		this.authorService = authorService;
	}

	@GetMapping()
	public ResponseEntity<List<AuthorAllDto>> getAll() {
		return new ResponseEntity<>(authorService.findAll(), HttpStatus.OK);
	}
}
