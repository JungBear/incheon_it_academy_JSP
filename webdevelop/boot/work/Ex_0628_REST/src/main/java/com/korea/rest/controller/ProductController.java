package com.korea.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

import com.korea.rest.service.ProductService;
import com.korea.rest.vo.ProductVO;

@Controller
@RequestMapping("/product/*")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("list")
	public String list(Model model) {
		List<ProductVO> list = productService.getList();
		ProductVO productForm = new ProductVO();
		
		model.addAttribute("productForm", productForm);
		model.addAttribute("list", list);
		
		return "product/product_list";
	}
	
	@PostMapping("new")
	@ResponseBody
	public void register(@RequestBody ProductVO vo) {
		productService.register(vo);
	}
	
}
