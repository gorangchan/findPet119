package com.my.findpet119.common.login.service;

import java.util.Date;

import lombok.Data;

	@Data
public class MemberVO {

	private int seq; /* 번호 */
	private String user_name; /* 이름 */
	private String user_id; /* 아이디 */
	private String pw; /* 비밀번호 */
	private String email; /* 이메일 */
	private String user_phone; /* 연락처 */
	private String address1; /* 주소 */
	private String address2; /* 주소2 */
	private String create_userid; /* 작성자 */
	private Date create_datetime; /* 작성시간 */
	private String update_userid; /* 수정자 */
	private Date update_datetime; /* 수정시간 */
	private char delete_flag; /* 삭제여부 */
	private int access_level; /* 관리자 0, 기본 1 */

}
