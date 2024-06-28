package com.koreak.tier.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.koreak.tier.dto.OrderDTO;
import com.koreak.tier.service.OrderServiceImpl;
import com.koreak.tier.vo.OrderVO;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("order/*")
public class OrderController {
	
	private final OrderServiceImpl orderService;
	
	@GetMapping("done")
	public RedirectView order(OrderVO vo) {
		System.out.println("주문갯수 : " + vo.getProductCount());
		orderService.order(vo);
		return new RedirectView("/product/list");
	}
	
	@GetMapping("list")
	public String list(@RequestParam(required = false)String sort, Model model) {
		if(sort == null) {
			sort = "recent";
		}
		List<OrderDTO> orders = new ArrayList<>();
		orders = orderService.list(sort);
		model.addAttribute("orders", orders);
		model.addAttribute("sort", sort);
		return "order/order-list";
	}
	
}
