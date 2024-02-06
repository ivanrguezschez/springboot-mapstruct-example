package com.irs.springbootmapstructexample.services;

import java.util.List;

import com.irs.springbootmapstructexample.dto.AuthorAllDto;

public interface AuthorService {

	List<AuthorAllDto> findAll();
}
