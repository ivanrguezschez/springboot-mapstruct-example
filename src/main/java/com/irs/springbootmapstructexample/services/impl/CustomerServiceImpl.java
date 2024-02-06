package com.irs.springbootmapstructexample.services.impl;

import org.springframework.stereotype.Service;

import com.irs.springbootmapstructexample.dto.CustomerGetDto;
import com.irs.springbootmapstructexample.dto.CustomerPostDto;
import com.irs.springbootmapstructexample.mappers.MapStructMapper;
import com.irs.springbootmapstructexample.repositories.CustomerRepository;
import com.irs.springbootmapstructexample.services.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	private final MapStructMapper mapStructMapper;
	
	private final CustomerRepository customerRepository;
	
	public CustomerServiceImpl(final MapStructMapper mapStructMapper, 
			final CustomerRepository customerRepository) {
		super();
		this.mapStructMapper = mapStructMapper;
		this.customerRepository = customerRepository;
	}
	
	@Override
	public void save(CustomerPostDto customerPostDto) {
		customerRepository.save(mapStructMapper.customerPostDtoToCustomer(customerPostDto));
	}

	@Override
	public CustomerGetDto findById(Integer id) {
		return mapStructMapper.customerToCustomerGetDto(customerRepository.findById(id).get());
	}

}
