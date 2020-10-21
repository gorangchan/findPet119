package com.my.findpet119.common.board.service;

import java.util.Date;

import lombok.Data;
@Data
public class ReplyVO {
    // 댓글번호 
    private int rSeq;

    // 글번호 
    private int seq;

    // 작성자 
    private String createUserid;

    // 내용 
    private String content;

    // 작성시간 
    private Date createDatetime;

    // 수정시간 
    private Date updateDatetime;
}
