package com.koreak.tier.service;

import org.springframework.stereotype.Service;

import com.koreak.tier.vo.OrderVO;

@Service
public interface OrderService {
	
	// 주문하기
	public void order(OrderVO orderVO);
}
