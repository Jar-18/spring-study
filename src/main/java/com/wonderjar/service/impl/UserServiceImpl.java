package com.wonderjar.service.impl;

import org.springframework.stereotype.Service;

import com.wonderjar.dto.UserDto;
import com.wonderjar.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	public UserDto findById(String userId) {
		UserDto userDto = new UserDto();
		userDto.setId("2");
		userDto.setName("Jar");
		return userDto;
	}
}
