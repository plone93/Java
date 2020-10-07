package com.example.demo.controller;


import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.BoardDTO;
import com.example.demo.entity.BoardVO;
import com.example.demo.service.BoardService;


@Controller
public class BoardController {
	
	@Autowired//객체생성을 스프링이 해줌
	BoardService boardService;
	
	@RequestMapping(value = "/boardList", method = RequestMethod.GET)//method가 GET이면서 url이 boardList
	public String boardList(BoardDTO boardDTO,//인수에 Bean을 작성하면 넘어오는 데이터들이 Bean에 있는 멤버필드에 있는 변수이름에 맞게 자동으로 들어감
							Model model) {
		String url = "/board/board_list";
		
		boardDTO.setBoardId("FREEBOARD");
		boardDTO.setKeyword("안녕");
		
		List<BoardVO> boardList = boardService.selectBoardList(boardDTO);//서비스에서 리스트를 받아옴
		model.addAttribute("boardList", boardList);//boardList 객체를 boardList라는 이름으로 프론트에 보냄

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
