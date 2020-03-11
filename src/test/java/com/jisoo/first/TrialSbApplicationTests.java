package com.jisoo.first;
 
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
 
import com.jisoo.first.web.dao.BoardMapper;
import com.jisoo.first.web.dao.UserMapper;
import com.jisoo.first.web.dto.BoardDto;
import com.jisoo.first.web.dto.UserDto;
import com.jisoo.first.web.service.BoardService;
import com.jisoo.first.web.service.UserService;
 
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TrialSbApplicationTests {
	
	@Autowired
	private UserService uService;
	
	@Autowired
	private BoardService bService;
	
	@Test
	public void borardTest() {
		BoardDto board = new BoardDto();
		board.setPassword("1234");
		board.setWriter("test");
		bService.write(board);
		
		for(BoardDto b : bService.getBoardList())
			System.out.println(b);
	}
	
	@Test
	public void userTest() {
		
		System.out.println(uService.getUser("test2"));
		System.out.println("로그인 결과 : "+uService.login("test2", "test"));
	}
    
}
