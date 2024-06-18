package com.korea.board;

import java.sql.SQLException;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.MemberDAO;
import lombok.RequiredArgsConstructor;
import util.Common;
import vo.MemberVO;

@Controller
@RequiredArgsConstructor
public class MemberController {

	final MemberDAO memberDAO;
	
	@Autowired
	HttpSession session;
	
	@RequestMapping("login_form")
	public String loginForm() {
		return Common.MEMBER_PATH + "login_form.jsp";
	}
	
	@RequestMapping("login")
	@ResponseBody
	public HashMap<String, String> login(String id, String pwd){
		MemberVO vo = memberDAO.loginCheck(id);
		
		HashMap<String, String> map = new HashMap<String, String>();

		if(vo == null || !vo.getPwd().equals(pwd)) {
			map.put("param", "no");
			return map;
		}
		
		// 세션에 바인딩
		session.setMaxInactiveInterval(3600);
		session.setAttribute("id", vo);
		
		map.put("param", "yes");
		return map;
		
	}
	
	@RequestMapping("logout")
	public String logout() {
		
		session.removeAttribute("id");
		return "redirect:board_list";
	}
	
	@RequestMapping("register_form")
	public String register_form() {
		return Common.MEMBER_PATH + "register_form.jsp";
	}
	
	@RequestMapping("member_insert")
	@ResponseBody
	public HashMap<String, String> member_insert(MemberVO vo){
		HashMap <String, String> map = new HashMap<String, String>();
			int rs = memberDAO.memberInsert(vo);		
			if(rs > 0) {
				map.put("param", "yes");
				return map;
			}else {
				map.put("param", "no");
				return map;
			}
	}
	
	@RequestMapping("check_id")
	@ResponseBody
	public HashMap<String, String> checkId(String id){
		HashMap <String, String> map = new HashMap<String, String>();
			int rs = memberDAO.checkId(id);		
			if(rs > 0) {
				map.put("param", "exist");
				return map;
			}else {
				map.put("param", "noexist");
				return map;
			}
	}
}
