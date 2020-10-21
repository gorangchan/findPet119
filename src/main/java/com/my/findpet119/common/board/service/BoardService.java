package com.my.findpet119.common.board.service;

import java.sql.SQLException;
import java.util.List;

public interface BoardService {

		// 게시물 목록
		public List<BoardVO> list() throws Exception;
		
		// 게시물 작성
		public void write(BoardVO vo) throws Exception;

		// 게시물 조회
		public BoardVO view(int seq) throws Exception;

		// 게시물 수정
		public void modify(BoardVO vo) throws Exception;
		
		// 게시물 삭제
		public void delete(int seq) throws Exception;
		
		// 게시물 총 갯수
		public int count() throws Exception;

		// 게시물 목록 + 페이징
		public List<BoardVO> listPage(int displayPost, int postNum) throws Exception;
	
		// 게시물 목록 + 페이징 + 검색
		public List<BoardVO> listPageSearch(
				int displayPost, int postNum, String searchType, String keyword) throws Exception;
		
		// 게시물 총 갯수 + 검색 적용
		public int searchCount(String searchType, String keyword) throws Exception;
}
