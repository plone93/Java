package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardController {
	HttpServletRequest request;
	HttpServletResponse response;
	
	
	public void boardList() {
		String url = "board/board_list.jsp";

		try {
			request.setCharacterEncoding("utf-8");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
