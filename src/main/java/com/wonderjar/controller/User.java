package com.wonderjar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wonderjar.dto.UserDto;
import com.wonderjar.service.IUserService;

@RestController
@RequestMapping("/users")
public class User {

	@Autowired
	IUserService userService;
	
	@RequestMapping("/{id}")
	public UserDto getById(@PathVariable("id") String userId) {
		UserDto userDto = userService.findById(userId);
		return userDto;
	}
	
}
