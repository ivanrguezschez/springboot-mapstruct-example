package com.irs.springbootmapstructexample.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.irs.springbootmapstructexample.dto.AuthorAllDto;
import com.irs.springbootmapstructexample.mappers.MapStructMapper;
import com.irs.springbootmapstructexample.repositories.AuthorRepository;
import com.irs.springbootmapstructexample.services.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService {

	private final MapStructMapper mapStructMapper;
	
	private final AuthorRepository authorRepository;
	
	public AuthorServiceImpl(final MapStructMapper mapStructMapper, 
			final AuthorRepository authorRepository) {
		super();
		this.mapStructMapper = mapStructMapper;
		this.authorRepository = authorRepository;
	}
	
	@Override
	public List<AuthorAllDto> findAll() {
		return mapStructMapper.authorsToAuthorAllDtos(authorRepository.findAll());
	}

}
