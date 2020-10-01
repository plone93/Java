package com.example.demo.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.example.demo.vo.BoardVO;
import com.example.domo.utils.DBManager;

public class BoardService {
	public List<BoardVO> selectBoardList(String boardId){
		StringBuffer buf = new StringBuffer();
		String query = "";
		buf.append("SELECT * FROM MST_GOODS");
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BoardVO boardVO = null;
		
		try {
			query = buf.toString();
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, boardId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public BoardVO viewBoard(String boardNum) {
		StringBuffer buf = new StringBuffer();
		String query = "";
		buf.append("SELECT *");
		buf.append("FROM");
		buf.append("MST_GOODS");
		buf.append("WHERE");
		buf.append("boardNum = ?");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BoardVO boardVO = null;
		
		try {
			query = buf.toString();
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, boardNum);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
