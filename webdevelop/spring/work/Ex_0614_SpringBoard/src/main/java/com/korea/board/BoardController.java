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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;

import dao.BoardDAO;
import lombok.RequiredArgsConstructor;
import util.Common;
import util.Common.Board;
import util.Page;
import vo.BoardVO;

@Controller
@RequiredArgsConstructor
public class BoardController {
	
	final BoardDAO boardDAO;
	
	@Autowired
	HttpServletRequest request;
	
	@Autowired
	HttpSession session;
	
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
		
		return Common.BOARD_PATH +  "board_list.jsp?page=" + nowPage;
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
		
		return Common.BOARD_PATH + "board_view.jsp?page=" + page;
	}
	
	@RequestMapping("insert_form")
	public String insert_form(@RequestParam(required = false, defaultValue = "1") String page) {
		if(session.getAttribute("id") == null) {
			return Common.MEMBER_PATH + "login_form.jsp";
		}	
		return Common.BOARD_PATH + "insert_form.jsp?page=" + page;
		
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
	
	@RequestMapping("del")
	@ResponseBody
	public HashMap<String, String> delect(int idx){
		BoardVO baseVO = boardDAO.selectPost(idx);
		baseVO.setSubject("이미 삭제된 글입니다.");
		baseVO.setName("unknown");
		
		int rs = boardDAO.del_update(baseVO);
		HashMap<String, String> map = new HashMap<String, String>();
		
		if(rs == 1) {
			map.put("param", "yes");
			return map;
		} else {
			map.put("param", "no");
			return map;
		}
	}
	
	@RequestMapping("reply_form")
	public String sendReplyForm(int idx, int page) {
		return Common.BOARD_PATH + "reply_form.jsp?idx=" + idx + "&page=" + page ;
	}
	
	@RequestMapping("reply")
	public String reply(int idx, int page, BoardVO vo) {
		
		BoardVO baseVO = boardDAO.selectPost(idx);
		int rs = boardDAO.updateReplyStep(baseVO);
		
		vo.setIp(request.getRemoteAddr());
		vo.setStep(baseVO.getStep() + 1);
		vo.setDepth(baseVO.getDepth() + 1);
		vo.setRef(baseVO.getRef());
		
		rs = boardDAO.insertReply(vo);
		
		
		
		if(rs > 0) {
			return "redirect:board_list?page=" + page;
		}else {
			return null;
		}
	}
	
}
