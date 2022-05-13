package com.codewithraushanblog.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codewithraushanblog.payloads.UserDto;

public interface UserService {
	
	
	UserDto registerNewUser(UserDto user);
	
	UserDto createUser(UserDto user);
	UserDto updateUser(UserDto user, Integer userId);
	UserDto getUserById(Integer userId);
	List<UserDto> getAllUsers();
	
	void deletUser(Integer userId);
}
