package com.example.demo.entity;

import lombok.Data;

@Data//롬복이 추가되야 사용가능
public class BoardVO {
	private String boardNum;
	private String boardId;
	private String boardTitle;
	private String content;
	private String writeDate;
}
