package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.BoardDTO;
import com.example.demo.entity.BoardVO;
import com.example.demo.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService{
	
	BoardMapper boardMapper;

	@Override
	public List<BoardVO> selectBoardList(BoardDTO boardDTO) {
		return boardMapper.selectBoardList(boardDTO);
	}

}
