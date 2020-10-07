package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.BoardDTO;
import com.example.demo.entity.BoardVO;

@Mapper//mybatis or ibatis가 추가되야 사용가능
public interface BoardMapper {
	public List<BoardVO> selectBoardList(BoardDTO boardDTO);
}
