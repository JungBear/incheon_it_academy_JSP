package com.koreak.tier.service;

import org.springframework.stereotype.Service;

import com.koreak.tier.dao.OrderDAO;
import com.koreak.tier.dao.ProductDAO;
import com.koreak.tier.vo.OrderVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService{

	
	private final OrderDAO orderDAO;
	private final ProductDAO productDAO;
	
	@Override
	public void order(OrderVO orderVO) {
		orderDAO.save(orderVO);
		productDAO.updateStock(orderVO);
		
	}
}
