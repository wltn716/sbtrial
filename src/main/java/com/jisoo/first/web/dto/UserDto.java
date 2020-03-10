package com.jisoo.first.web.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
	private String userId;
    private String userPw;
    private String userName;
    private String userGender;
    private String userEmail;
    
    @Override
    public String toString() {
        return "UserDto [userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + ", userGender="
                + userGender + ", userEmail=" + userEmail + "]";
    }
}
