package com.korea.board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
	
	@RequestMapping("/board_list")
	public String boardList(Model model) {
		
		return "board_list";
	}
}
