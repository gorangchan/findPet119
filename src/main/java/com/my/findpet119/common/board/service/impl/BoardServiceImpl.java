package com.my.findpet119.common.board.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.my.findpet119.common.board.service.BoardDAO;
import com.my.findpet119.common.board.service.BoardService;
import com.my.findpet119.common.board.service.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {
	
	private BoardDAO dao;
	
	// 게시물 목록
	@Override
	public List<BoardVO> list() throws Exception {

		return dao.list();
	}

	// 게시물 작성
	@Override
	public void write(BoardVO vo) throws Exception {
		
		dao.write(vo);
	}

	// 게시물 조회
	@Override
	public BoardVO view(int seq) throws Exception {

		return dao.view(seq);
	}

	// 게시물 수정
	@Override
	public void modify(BoardVO vo) throws Exception {
		
		dao.modify(vo);
	}

	// 게시물 삭제
	@Override
	public void delete(int seq) throws Exception {
		dao.delete(seq);
	}

	
	
	// 게시물 총 갯수
	@Override
	public int count() throws Exception {
		return dao.count();
	}

	
	
	// 게시물 목록 + 페이징
	@Override
	public List<BoardVO> listPage(int displayPost, int postNum) throws Exception {
		return dao.listPage(displayPost, postNum);
	}

	
	
	// 게시물 목록 + 페이징 + 검색
	@Override
	public List<BoardVO> listPageSearch(
			int displayPost, int postNum, String searchType, String keyword) throws Exception {
		return  dao.listPageSearch(displayPost, postNum, searchType, keyword);
	}
	
	// 게시물 총 갯수
	@Override
	public int searchCount(String searchType, String keyword) throws Exception {
		return dao.searchCount(searchType, keyword);
	}
}

