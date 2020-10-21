package com.my.findpet119.common.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.findpet119.common.board.service.BoardDAO;
import com.my.findpet119.common.board.service.BoardService;
import com.my.findpet119.common.board.service.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAO bd;

	@Override
	public List<BoardVO> notice_list(BoardVO board) {
		return bd.notice_list(board);
	}

	@Override
	public int notice_insert(BoardVO board) {
		return bd.notice_insert(board);
	}

	@Override
	public void notice_updateReadCount(int seq) {
		bd.notice_updateReadCount(seq);

	}

	@Override
	public BoardVO notice_select(int seq) {
		return bd.notice_select(seq);
	}

	@Override
	public int notice_getTotal(BoardVO board) {
		return bd.notice_getTotal(board);
	}

	@Override
	public int notice_update(BoardVO board) {
		return bd.notice_update(board);
	}

	@Override
	public int notice_delete(int seq) {
		return bd.notice_delete(seq);
	}

	@Override
	public int notice_maxNum() {
		return bd.notice_maxNum();
	}

	@Override
	public void notice_updateRe_step(BoardVO board) {
		bd.notice_updateRe_step(board);

	}

	@Override
	public List<BoardVO> lostBoard_list(BoardVO board) {
		return bd.lostBoard_list(board);
	}

	@Override
	public int lostBoard_insert(BoardVO board) {
		return bd.lostBoard_insert(board);
	}

	@Override
	public void lostBoard_updateReadCount(int seq) {
		bd.lostBoard_updateReadCount(seq);

	}

	@Override
	public BoardVO lostBoard_select(int seq) {
		return bd.lostBoard_select(seq);
	}

	@Override
	public int lostBoard_getTotal(BoardVO board) {
		return bd.lostBoard_getTotal(board);
	}

	@Override
	public int lostBoard_update(BoardVO board) {
		return bd.lostBoard_update(board);
	}

	@Override
	public int lostBoard_delete(int seq) {
		return bd.lostBoard_delete(seq);

	}

	@Override
	public int lostBoard_maxNum() {
		return bd.lostBoard_maxNum();
	}

	@Override
	public void lostBoard_updateRe_step(BoardVO board) {
		bd.lostBoard_updateRe_step(board);

	}

	@Override
	public List<BoardVO> findBoard_list(BoardVO board) {
		return bd.findBoard_list(board);
	}

	@Override
	public int findBoard_insert(BoardVO board) {
		return bd.findBoard_insert(board);
	}

	@Override
	public void findBoard_updateReadCount(int seq) {
		bd.findBoard_updateReadCount(seq);

	}

	@Override
	public BoardVO findBoard_select(int seq) {
		return bd.findBoard_select(seq);
	}

	@Override
	public int findBoard_getTotal(BoardVO board) {
		return bd.findBoard_getTotal(board);
	}

	@Override
	public int findBoard_update(BoardVO board) {
		return bd.findBoard_update(board);

	}

	@Override
	public int findBoard_delete(int seq) {
		return bd.findBoard_delete(seq);

	}

	@Override
	public int findBoard_maxNum() {
		return bd.findBoard_maxNum();
	}

	@Override
	public void findBoard_updateRe_step(BoardVO board) {
		bd.findBoard_updateRe_step(board);

	}

}
