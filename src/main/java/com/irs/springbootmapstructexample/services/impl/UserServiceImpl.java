package com.irs.springbootmapstructexample.services.impl;

import org.springframework.stereotype.Service;

import com.irs.springbootmapstructexample.dto.UserGetDto;
import com.irs.springbootmapstructexample.dto.UserPostDto;
import com.irs.springbootmapstructexample.mappers.MapStructMapper;
import com.irs.springbootmapstructexample.repositories.UserRepository;
import com.irs.springbootmapstructexample.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	private final MapStructMapper mapStructMapper;
	
	private final UserRepository userRepository;
	
	public UserServiceImpl(final MapStructMapper mapStructMapper, 
			final UserRepository userRepository) {
		super();
		this.mapStructMapper = mapStructMapper;
		this.userRepository = userRepository;
	}
	
	@Override
	public void save(UserPostDto userPostDto) {
		userRepository.save(mapStructMapper.userPostDtoToUser(userPostDto));
	}

	@Override
	public UserGetDto findById(Integer id) {
		return mapStructMapper.userToUserGetDto(userRepository.findById(id).get());
	}
}
