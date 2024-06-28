package com.korea.rest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.korea.rest.dao.OrderDAO;
import com.korea.rest.dao.ProductDAO;
import com.korea.rest.dto.OrderDTO;
import com.korea.rest.vo.OrderVO;

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
	
	@Override
	public List<OrderDTO> list(String sort) {
		return orderDAO.list(sort);
	}
}
