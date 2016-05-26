package com.wonderjar.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wonderjar.dto.UserDto;

@RestController
@RequestMapping("/users")
public class User {

	@RequestMapping("/{id}")
	public UserDto getById(@PathVariable("id") String userId) {
		UserDto userDto = new UserDto();
		userDto.setId("1");
		userDto.setName("Jar");
		return userDto;
	}
	
}
