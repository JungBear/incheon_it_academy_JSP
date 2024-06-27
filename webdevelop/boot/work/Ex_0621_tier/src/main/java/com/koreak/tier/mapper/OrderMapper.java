package com.koreak.tier.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.koreak.tier.vo.OrderVO;

@Mapper
public interface OrderMapper {
	
	// 주문하기
	public void insert(OrderVO orderVO);
}
