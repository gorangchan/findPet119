package com.my.findpet119.common.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.my.findpet119.common.board.service.BoardService;
import com.my.findpet119.common.board.service.BoardVO;
import com.my.findpet119.common.board.service.PagingBean;

@Controller
public class BoardController {
	@Controller
	public class BoardContrpller {
		@Autowired
		private BoardService bs;
		@RequestMapping("/list")
		public String init() {
			return "redirect:/list/pageNum/1";
		}
		@RequestMapping("/list/pageNum/{pageNum}")
		public String list(@PathVariable String pageNum,BoardVO board,
				Model model) {
			int rowPerPage = 10;
			// 페이지가 지정되지 않으면 1페이지를 보여줘라
			if (pageNum==null || pageNum.equals(""))
				pageNum="1";
			int currentPage = Integer.parseInt(pageNum);
			int total = bs.notice_getTotal(board); 
			int startRow = (currentPage - 1)*rowPerPage + 1;
			int endRow = startRow + rowPerPage - 1;
			board.setStartRow(startRow);
			board.setEndRow(endRow);
		//	List<Board> list = bs.list(startRow, endRow);
		//  board : search, keyword, stardRow, endRow
			List<BoardVO> list = bs.notice_list(board);
			PagingBean pb = new PagingBean(currentPage,rowPerPage,total);
			String[] tit = {"작성자","제목","내용","제목+내용"};
			model.addAttribute("tit", tit);
			model.addAttribute("list", list);
			model.addAttribute("board", board);
			model.addAttribute("pb", pb);
			return "list";
		}
	}
}
