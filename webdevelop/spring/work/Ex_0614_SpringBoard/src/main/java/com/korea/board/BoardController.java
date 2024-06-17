package com.korea.board;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dao.BoardDAO;
import lombok.RequiredArgsConstructor;
import util.Common.Board;
import util.Page;
import vo.BoardVO;

@Controller
@RequiredArgsConstructor
public class BoardController {
	
	final BoardDAO boardDAO;
	
	@Autowired
	HttpServletRequest request;
	
	@RequestMapping(value = {"/","/board_list"})
	public String boardList(String page, Model model) {
		
		int nowPage = 1;
		
		if(page != null && !page.isEmpty()) {
			nowPage = Integer.parseInt(page);
		}
		
		
		
		int start = (nowPage-1)* Board.BLOCKLIST + 1;
		int end = nowPage * Board.BLOCKLIST;
		
		int rowTotal = boardDAO.getTotal();
		
		String pageMenu = Page.getPage("board_list", nowPage, rowTotal, Board.BLOCKLIST, Board.BLOCKPAGE);
		
		request.getSession().removeAttribute("show");
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", start);
		map.put("end", end);
		
		List<BoardVO> list = boardDAO.boardList(map);
		
		model.addAttribute("pageMenu", pageMenu);
		model.addAttribute("list", list);
		
		return "board_list.jsp?page=" + nowPage;
	}
	
	@RequestMapping("/view")
	public String view(int idx, @RequestParam(required = false, defaultValue = "1") String page, Model model) {
		BoardVO vo = boardDAO.selectPost(idx);
		
		HttpSession session = request.getSession();
		System.out.println(session.getAttribute("show"));
		String show = (String)session.getAttribute("show");
		System.out.println("show : " + show);
		if(show == null || show.isEmpty()) {
			int rs = boardDAO.update_readhit(idx);
			session.setAttribute("show", "1");
		}
		
		model.addAttribute("vo", vo);
		
		return "board_view.jsp?page=" + page;
	}
	
	@RequestMapping("insert_form")
	public String insert_form(@RequestParam(required = false, defaultValue = "1") String page) {
		return "insert_form.jsp?page=" + page;
	}
	
	@RequestMapping("insert.do")
	public String insert(BoardVO vo) {
		vo.setIp(request.getRemoteAddr());
		int rs = boardDAO.board_insert(vo);
			if(rs > 0) {
				return "redirect:board_list";
			}else {
				return null;
			}
	}
}
