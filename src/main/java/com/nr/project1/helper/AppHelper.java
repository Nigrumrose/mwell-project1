package com.nr.project1.helper;

import com.nr.project1.domain.User;
import com.nr.project1.domain.UserType;
import com.nr.project1.model.UserDto;

public class AppHelper {

	public static UserDto getDtoFromEntity(User user){
		UserDto userDto = new UserDto();
		userDto.setFirstName(user.getFirstName());
		userDto.setLastName(user.getLastName());
		userDto.setType(user.getType().getUserTypeCode());
		return userDto;
	}
	
	public static User getEntityFromDto(UserDto userDto){
		User user = new User();
		user.setFirstName(userDto.getFirstName());
		user.setLastName(userDto.getLastName());
		//user.setType(new UserType(userDto.getType()));
		return user;
	}
}
