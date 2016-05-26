package com.wonderjar.service;

import com.wonderjar.dto.UserDto;

public interface IUserService {
	public UserDto findById(String userId);
}
