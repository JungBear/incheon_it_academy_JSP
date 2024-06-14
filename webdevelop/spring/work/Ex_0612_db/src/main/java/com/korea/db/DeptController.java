package com.korea.db;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dao.DeptDAO;
import lombok.RequiredArgsConstructor;
import vo.DeptVO;

@Controller
@RequiredArgsConstructor
public class DeptController {
	
	public static final String VIEW_PATH = "/WEB-INF/views/dept/";
	
	final DeptDAO dept_dao;
	
	@RequestMapping(value= {"/", "dept_list"})
	public String list(@RequestParam Model model) {
		List<DeptVO> list = dept_dao.selectList();
		model.addAttribute("list",list);
		return VIEW_PATH + "dept_list.jsp";
	}
}
