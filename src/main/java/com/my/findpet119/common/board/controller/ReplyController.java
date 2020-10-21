package com.my.findpet119.common.board.controller;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.my.findpet119.common.board.service.ReplyService;

@Controller
@RequestMapping("/reply/*")
public class ReplyController {

	@Autowired
	private ReplyService replyService;
	
	// 댓글 조회
	
	// 댓글 작성
	
	// 댓글 수정
	
	// 댓글 삭제
	
}
