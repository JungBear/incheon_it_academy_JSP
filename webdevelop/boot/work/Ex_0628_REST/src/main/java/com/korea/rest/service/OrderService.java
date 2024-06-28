package com.korea.rest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.korea.rest.dto.OrderDTO;
import com.korea.rest.vo.OrderVO;

@Service
public interface OrderService {
	
	// 주문하기
	public void order(OrderVO orderVO);
	
	// 주문 내역 조회하기
	public List<OrderDTO> list(String sort);
}
