package com.jisoo.first.web;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jisoo.first.web.service.UserService;

@RestController
public class HelloController {
	
	@Resource(name="userService")
	private UserService us;
	
	 @GetMapping("/hello") //Get Method 사용
     public ModelAndView helloView(ModelAndView mv) throws Exception{
		 mv.addObject("users", us.getUserList());
		 mv.setViewName("hello");
         return mv;
     }

}
