package com.my.findpet119.common.board.service;

import java.util.Date;

import lombok.Data;

	@Data
public class CodeItemVO {
	
	private int	seq; /* CODE SLAVE */
	private int	code_seq; /* 코드 SEQ */
	private String name; /* 코드아이템 명 */
	private	String create_userid; /*작성자*/
	private	Date create_datetime; /* 작성시간 */
	private	String update_userid; /*수정자*/
	private	Date  update_datetime; /* 수정시간 */
	private	char delete_flag; /*삭제여부*/
}
