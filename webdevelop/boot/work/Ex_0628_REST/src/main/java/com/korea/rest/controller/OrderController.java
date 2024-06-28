package com.korea.rest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.rest.dto.OrderDTO;
import com.korea.rest.service.OrderServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("order/*")
public class OrderController {
	
	private final OrderServiceImpl orderService;
	
	@GetMapping("list/{sort}")
	public List<OrderDTO> list(@PathVariable("sort") String sort){
		return orderService.list(sort);
	}
	
}
