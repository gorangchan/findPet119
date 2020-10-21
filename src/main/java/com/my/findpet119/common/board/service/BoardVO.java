package com.my.findpet119.common.board.service;

import java.util.Date;

import lombok.Data;
@Data
public class BoardVO {
	    // 글번호 
	    private int seq;
	    // 분류 1. NOTICE, 2.LOST, 3.FIND
	    private String category;
	    // 제목 
	    private String title;
	    // 내용 
	    private String content;
	    // 연락처 
	    private String phone;
	    // 장소 
	    private String place;
	    // 시간 
	    private Date b_time;
	    // 현재 상태 
	    private String b_state;
	    // 첨부파일 
	    private String b_file;
	    // 조회수 
	    private int hit_cnt;
	    // 작성자 
	    private String create_userid;
	    // 작성시간 
	    private Date create_datetime;
	    // 수정자 
	    private String update_userid;
	    // 수정시간 
	    private Date update_datetime;
	    // 삭제여부 
	    private String delete_flag;
	 }
