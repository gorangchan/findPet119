package com.my.findpet119.common.board.service;

import java.util.Date;

import lombok.Data;
	
	@Data
public class CodeVO {
	
	private int seq; /* code seq */
	private String name; /*code name */
	private	String create_userid; /*작성자*/
	private	Date create_datetime; /* 작성시간 */
	private	String update_userid; /*수정자*/
	private	Date  update_datetime; /* 수정시간 */
	private	char delete_flag; /*삭제여부*/
}
