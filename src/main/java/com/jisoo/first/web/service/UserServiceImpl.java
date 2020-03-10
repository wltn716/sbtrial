package com.jisoo.first.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jisoo.first.web.dao.UserMapper;
import com.jisoo.first.web.dto.UserDto;

@Service("userService")
public class UserServiceImpl  implements UserService{
	@Autowired
	private UserMapper uMapper;
	
	@Override
	public boolean login (String userId, String userPw) {
		UserDto user = uMapper.selectOneUser(userId);
		if(user != null) {
			if (user.getUserPw().contentEquals(userPw)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean join (UserDto user) {
		if(uMapper.selectOneUser(user.getUserId())==null) {
			uMapper.insertUser(user);
			return true;
		}
		return false;
	}
	
	@Override
	public void modify(UserDto user) {
		uMapper.updateUser(user);
	}
	
	@Override
	public void withdraw(String userId) {
		uMapper.deleteUser(userId);
	}
	
	@Override
	public UserDto getUser(String userId) {
		return uMapper.selectOneUser(userId);
	}
	
	@Override
	public List<UserDto> getUserList(){
		return uMapper.selectAllUser();
	}
}
