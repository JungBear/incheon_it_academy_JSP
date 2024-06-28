package com.korea.rest.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.korea.rest.dto.OrderDTO;
import com.korea.rest.mapper.OrderMapper;
import com.korea.rest.vo.OrderVO;

@Repository
public class OrderDAO {
	
	@Autowired
	OrderMapper orderMapper;
	
	public void save(OrderVO orderVO) {
		orderMapper.insert(orderVO);
	}
	
	public List<OrderDTO> list(String sort){
		return orderMapper.selectAll(sort);
	}
}
