package com.example.demo.controller;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardController {
	
	@RequestMapping(value = "/boardList", method = RequestMethod.GET)
	public String boardList() {
		String url = "/board/board_list";
		
		
		
		return url;
	}
	
	@SuppressWarnings("unchecked")//검증되지 않은 연산자 관련 경고 억제
	public JSONObject JSONStudy() {
		JSONObject obj1 = new JSONObject();//첫번째 JSON객체 생성
		obj1.put("memberNum", 1);
		obj1.put("memberId", "ABC123");
		
		
		JSONObject obj2 = new JSONObject();//두번째 JSON객체 생성
		obj2.put("memberNum", 1);
		obj2.put("memberId", "ABC123");
		obj2.put("memberName", "KIM");
		
		JSONArray memberList = new JSONArray();//JSON리스트 생성
		memberList.add(obj2);//JSON객체를 JSON리스트에 넣음, 메모리에서의 형태는 Bean을 리스트에 넣었을 때와 같음
		
		obj1.put("memberList", memberList);//JSON리스트를 첫번째 JSON객체에 넣음
		
		return obj1;
	}
	
	@GetMapping("/viewBoard")
	public String boardInsert(@RequestParam("boardNumber")Integer boardNumber) {
		String url = "";//이동할 페이지
		
		return url;
	}
	

	

}
