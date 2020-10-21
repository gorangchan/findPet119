package com.my.findpet119.common.board.service;

import java.util.List;


public interface BoardService {

//	List<BoardVO> list(int startRow, int endRow);
	List<BoardVO> notice_list(BoardVO board);

	int notice_insert(BoardVO board);

	void notice_updateReadCount(int seq);

	BoardVO notice_select(int seq);

	int notice_getTotal(BoardVO board);

	int notice_update(BoardVO board);

	int notice_delete(int seq);

	int notice_maxNum();

	void notice_updateRe_step(BoardVO board);

//	List<BoardVO> lostBoard_list(int startRow, int endRow);
	List<BoardVO> lostBoard_list(BoardVO board);

	int lostBoard_insert(BoardVO board);

	void lostBoard_updateReadCount(int seq);

	BoardVO lostBoard_select(int seq);

	int lostBoard_getTotal(BoardVO board);

	int lostBoard_update(BoardVO board);

	int lostBoard_delete(int seq);

	int lostBoard_maxNum();

	void lostBoard_updateRe_step(BoardVO board);

//	List<BoardVO> findBoard_list(int startRow, int endRow);
	List<BoardVO> findBoard_list(BoardVO board);

	int findBoard_insert(BoardVO board);

	void findBoard_updateReadCount(int seq);

	BoardVO findBoard_select(int seq);

	int findBoard_getTotal(BoardVO board);

	int findBoard_update(BoardVO board);

	int findBoard_delete(int seq);

	int findBoard_maxNum();

	void findBoard_updateRe_step(BoardVO board);

}