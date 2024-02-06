package com.irs.springbootmapstructexample.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.irs.springbootmapstructexample.dto.UserGetDto;
import com.irs.springbootmapstructexample.dto.UserPostDto;
import com.irs.springbootmapstructexample.services.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

	private final UserService userService;

	public UserController(final UserService userService) {
		super();
		this.userService = userService;
	}

	@PostMapping()
	public ResponseEntity<Void> create(@Valid @RequestBody UserPostDto userPostDto) {
		userService.save(userPostDto);

		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public ResponseEntity<UserGetDto> getById(@PathVariable(value = "id") Integer id) {
		return new ResponseEntity<>(userService.findById(id), HttpStatus.OK);
	}
}
