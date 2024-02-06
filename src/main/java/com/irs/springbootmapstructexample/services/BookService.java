package com.irs.springbootmapstructexample.services;

import com.irs.springbootmapstructexample.dto.BookDto;

public interface BookService {
	
	BookDto findById(Integer id);
}
