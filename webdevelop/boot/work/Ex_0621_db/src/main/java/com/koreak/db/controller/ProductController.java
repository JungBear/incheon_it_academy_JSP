package com.koreak.db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.koreak.db.mapper.ProductMapper;

import vo.ProductVO;

@Controller
public class ProductController {
	
	@Autowired
	ProductMapper productMapper;
	
	@GetMapping("register")
	public String register(Model model) {
		model.addAttribute("productVO", new ProductVO());
		
		return "product_insert";
	}
	
	@PostMapping("register")
	public RedirectView register(ProductVO productVO) {
		productMapper.insert(productVO);
		
		return new RedirectView("list");
	}
	
	@GetMapping("list")
	public String list(Model model) {
		
		List<ProductVO> list = productMapper.selectAll();
		model.addAttribute("list", list);
		// 메서드명 selectAll()
		return "product_list";
	}
}
