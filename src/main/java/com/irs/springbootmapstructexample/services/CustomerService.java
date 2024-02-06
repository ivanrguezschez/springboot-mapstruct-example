package com.irs.springbootmapstructexample.services;

import com.irs.springbootmapstructexample.dto.CustomerGetDto;
import com.irs.springbootmapstructexample.dto.CustomerPostDto;

public interface CustomerService {

	void save(CustomerPostDto customerPostDto);
	
	CustomerGetDto findById(Integer id);
}
