package com.irs.springbootmapstructexample.services;

import com.irs.springbootmapstructexample.dto.UserGetDto;
import com.irs.springbootmapstructexample.dto.UserPostDto;

public interface UserService {

	void save(UserPostDto userPostDto);
	
	UserGetDto findById(Integer id);
}
