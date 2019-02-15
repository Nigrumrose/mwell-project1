package com.nr.project1.service;

import java.util.List;

import com.nr.project1.model.UserDto;

public interface UserService {

	void add(UserDto userDto) throws Exception;
	
	List<UserDto> getAllUsers();
	
	UserDto getUserByLoginId(String userId);
	
	UserDto updateUser(UserDto userDto);
	
	String deleteUser(String userId);
}
