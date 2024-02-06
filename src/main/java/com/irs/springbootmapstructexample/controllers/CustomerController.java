package com.irs.springbootmapstructexample.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.irs.springbootmapstructexample.dto.CustomerGetDto;
import com.irs.springbootmapstructexample.dto.CustomerPostDto;
import com.irs.springbootmapstructexample.services.CustomerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	private final CustomerService customerService;

	public CustomerController(final CustomerService customerService) {
		super();
		this.customerService = customerService;
	}

	@PostMapping()
	public ResponseEntity<Void> create(@Valid @RequestBody CustomerPostDto customerPostDto) {
		customerService.save(customerPostDto);

		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public ResponseEntity<CustomerGetDto> getById(@PathVariable(value = "id") Integer id) {
		return new ResponseEntity<>(customerService.findById(id), HttpStatus.OK);
	}
}
