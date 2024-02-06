package com.irs.springbootmapstructexample.services.impl;

import org.springframework.stereotype.Service;

import com.irs.springbootmapstructexample.dto.BookDto;
import com.irs.springbootmapstructexample.mappers.MapStructMapper;
import com.irs.springbootmapstructexample.repositories.BookRepository;
import com.irs.springbootmapstructexample.services.BookService;

@Service
public class BookServiceImpl implements BookService {

	private final MapStructMapper mapStructMapper;
	
	private final BookRepository bookRepository;
	
	public BookServiceImpl(final MapStructMapper mapStructMapper, 
			final BookRepository bookRepository) {
		super();
		this.mapStructMapper = mapStructMapper;
		this.bookRepository = bookRepository;
	}
	
	@Override
	public BookDto findById(Integer id) {
		return mapStructMapper.bookToBookDto(bookRepository.findById(id).get());
	}
}
