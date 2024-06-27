package com.koreak.tier.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.koreak.tier.service.ProductService;
import com.koreak.tier.vo.ProductVO;

@Controller
@RequestMapping("/product/*")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("list")
	public String list(Model model) {
		List<ProductVO> list = productService.getList();
		model.addAttribute("list", list);
		return "product/product_list";
	}
	
	@GetMapping("register")
	public String register(Model model) {
		model.addAttribute("vo", new ProductVO());
		return "product/product-insert";
	}
	
	@PostMapping("register")
	public RedirectView insert(ProductVO productVO) {
		System.out.println("제품명 : " + productVO);
		productService.register(productVO);
		return new RedirectView("list");
	}
	
}
