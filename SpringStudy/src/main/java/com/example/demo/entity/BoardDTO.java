package com.example.demo.entity;

import lombok.Data;

@Data//롬복이 추가되야 사용가능
public class BoardDTO {
	private String boardId;
	private String keyword;
}
