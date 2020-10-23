package com.my.findpet119.common.board.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.my.findpet119.common.board.service.ReplyDAO;
import com.my.findpet119.common.board.service.ReplyVO;

@Repository
public class ReplyDAOImpl implements ReplyDAO {
	
	
	@Resource(name = "sqlSession")
	private SqlSession sql;
	
	private static String namespace = "com.my.findpet119.common.board.mappers.reply";

	// 댓글 조회
	@Override
	public List<ReplyVO> list(int seq) throws Exception {
		return sql.selectList(namespace + ".replyList", seq);
	}

	// 댓글 작성
	@Override
	public void write(ReplyVO vo) throws Exception {
		sql.insert(namespace + ".replyWrite", vo);
	}

	// 댓글 수정
	@Override
	public void modify(ReplyVO vo) throws Exception {
		sql.update(namespace + ".replyModify", vo);
	}

	// 댓글 삭제
	@Override
	public void delete(ReplyVO vo) throws Exception {
		sql.delete(namespace + ".replyDelete", vo);
	}

}
