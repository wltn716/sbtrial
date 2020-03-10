package com.jisoo.first.web.dto;

import static org.assertj.core.api.Assertions.assertThat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;

public class BoardDtoTest {
	
	@Test
	public void 롬복_기능_테스트() {
		int num = 1;
		String title="제목";
		String content="안녕하세요 내용입니다.";
		String writer = "Jisoo";
		String password="0000";
		Date writeDate = new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime();
		
		BoardDto dto = new BoardDto();
		
		assertThat(dto.getNum()).isEqualTo(num);
		assertThat(dto.getContent()).isEqualTo(content);
		assertThat(dto.getWriter()).isEqualTo(writer);
		assertThat(dto.getPassword()).isEqualTo(password);
		assertThat(dto.getWriteDate()).isEqualTo(writeDate);
	}
}

