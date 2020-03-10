package com.jisoo.first.web.service;

import java.util.List;

import com.jisoo.first.web.dto.UserDto;

public interface UserService {
	public boolean login (String userId, String userPw);
	public boolean join (UserDto user);
	public void modify (UserDto user);
	public void withdraw (String userId);
	public UserDto getUser (String userId);
	public List<UserDto> getUserList();
}
