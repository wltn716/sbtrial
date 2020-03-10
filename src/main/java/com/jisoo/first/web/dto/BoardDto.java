package com.jisoo.first.web.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDto {
	
	 private int num;
	 private String title;
     private String content;
     private String writer;
     private String password;
     private Date writeDate;
     
     @Override
     public String toString() {
         return "BoardDto [num=" + num + ", title=" + title + ", content=" + content + ", writer=" + writer
                 + ", password=" + password + ", writeDate=" + writeDate + "]";
     }

}
