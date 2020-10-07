package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.BoardDTO;
import com.example.demo.entity.BoardVO;

public interface BoardService {
	public List<BoardVO> selectBoardList(BoardDTO boardDTO);
}
