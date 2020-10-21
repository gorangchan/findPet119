package com.my.findpet119.common.board.service.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.my.findpet119.common.board.service.BoardDAO;
import com.my.findpet119.common.board.service.BoardVO;
import com.my.findpet119.common.board.service.CodeItemVO;
import com.my.findpet119.common.board.service.CodeVO;



public class BoardDAOImpl implements BoardDAO{
	@Autowired
	private SqlSessionTemplate sst;

	@Override
	public List<BoardVO> notice_list(BoardVO board) {
		return sst.selectList("boardns.notice_list", board);
	}

	@Override
	public int notice_insert(BoardVO board) {
		return sst.insert("boardns.notice_insert", board);
	}
	@Override
	public void notice_updateReadCount(int seq) {
		sst.update("boardns.notice_updateReadCount", seq);	
	}

	@Override
	public BoardVO notice_select(int seq) {
		return sst.selectOne("boardns.notice_select", seq);
	}

	@Override
	public int notice_getTotal(BoardVO board) {
		return sst.selectOne("boardns.notice_getTotal",board);
	}

	@Override
	public int notice_update(BoardVO board) {
		return sst.update("boardns.notice_update", board);
	}

	@Override
	public int notice_delete(int seq) {
		return sst.update("boardns.notice_delete",seq);
	}

	@Override
	public int notice_maxNum() {
		return sst.selectOne("boardns.notice_maxNum");
	}

	@Override
	public void notice_updateRe_step(BoardVO board) {
		sst.update("boardns.notice_updateRe_step",board);
		
	}

	@Override
	public List<BoardVO> lostBoard_list(BoardVO board) {
		return sst.selectList("boardns.lostBoard_list", board);
	}

	@Override
	public int lostBoard_insert(BoardVO board) {
		return sst.insert("boardns.lostBoard_insert", board);
	}

	@Override
	public void lostBoard_updateReadCount(int seq) {
		sst.update("boardns.lostBoard_updateReadCount", seq);	
		
	}

	@Override
	public BoardVO lostBoard_select(int seq) {
		return sst.selectOne("boardns.lostBoard_select", seq);
	}

	@Override
	public int lostBoard_getTotal(BoardVO board) {
		return sst.selectOne("boardns.lostBoard_getTotal",board);
	}

	@Override
	public int lostBoard_update(BoardVO board) {
		return sst.update("boardns.lostBoard_update", board);
	}

	@Override
	public int lostBoard_delete(int seq) {
		return sst.update("boardns.lostBoard_delete",seq);
	}

	@Override
	public int lostBoard_maxNum() {
		return sst.selectOne("boardns.lostBoard_maxNum");
	}

	@Override
	public void lostBoard_updateRe_step(BoardVO board) {
		sst.update("boardns.lostBoard_updateRe_step",board);
		
	}

	@Override
	public List<BoardVO> findBoard_list(BoardVO board) {
		return sst.selectList("boardns.findBoard_list", board);
	}

	@Override
	public int findBoard_insert(BoardVO board) {
		return sst.insert("boardns.findBoard_insert", board);
	}

	@Override
	public void findBoard_updateReadCount(int seq) {
		sst.update("boardns.findBoard_updateReadCount", seq);	
	}

	@Override
	public BoardVO findBoard_select(int seq) {
		return sst.selectOne("boardns.findBoard_select", seq);
	}

	@Override
	public int findBoard_getTotal(BoardVO board) {
		return sst.selectOne("boardns.findBoard_getTotal",board);
	}

	@Override
	public int findBoard_update(BoardVO board) {
		return sst.update("boardns.findBoard_update", board);
	}

	@Override
	public int findBoard_delete(int seq) {
		return sst.update("boardns.findBoard_delete",seq);
	}

	@Override
	public int findBoard_maxNum() {
		return sst.selectOne("boardns.findBoard_maxNum");
	}

	@Override
	public void findBoard_updateRe_step(BoardVO board) {
		sst.update("boardns.findBoard_updateRe_step",board);
		
	}

}