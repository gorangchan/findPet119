package com.my.findpet119.common.board.service;

import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {
		//Board (1. NOTICE, 2.LOST, 3.FIND)
		private	int seq; 
		private char category; /* 1. NOTICE, 2.LOST, 3.FIND */
		private String title;  /* 제목 */
		private	String content;/* 내용 */
		private	String phone; /*연락처*/
		private	String place;	/*장소*/
		private	Date b_time; /* 시간 */
		private	String b_state;	/*현재 상태*/
		private	String b_file;	/*첨부파일*/
		private	int	hit_cnt; /* 조회수 */
		private	String create_userid; /*작성자*/
		private	Date create_datetime; /* 작성시간 */
		private	String	update_userid; /*수정자*/
		private	Date  update_datetime; /* 수정시간 */
		private	char delete_flag; /*삭제여부*/
		private int ref; 
		private int re_step;
		private int re_level; 
		
	
		//Paging
		private int startRow;
		private int endRow;
		
		// search
		private String search;
		private String keyword;
}
