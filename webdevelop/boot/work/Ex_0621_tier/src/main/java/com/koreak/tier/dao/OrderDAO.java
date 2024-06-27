package com.koreak.tier.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.koreak.tier.mapper.OrderMapper;
import com.koreak.tier.vo.OrderVO;

@Repository
public class OrderDAO {
	
	@Autowired
	OrderMapper orderMapper;
	
	public void save(OrderVO orderVO) {
		orderMapper.insert(orderVO);
	}
}
