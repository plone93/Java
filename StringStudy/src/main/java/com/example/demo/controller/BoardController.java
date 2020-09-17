package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {
	
	@RequestMapping(value = "/boardList", method = RequestMethod.GET)
	public String boardList() {
		String url = "/board/board_list";
		
		return url;
	}
	
	

}
