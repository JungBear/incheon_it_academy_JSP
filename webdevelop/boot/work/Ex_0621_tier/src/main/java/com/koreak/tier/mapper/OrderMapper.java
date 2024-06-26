package com.koreak.tier.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.koreak.tier.dto.OrderDTO;
import com.koreak.tier.vo.OrderVO;

@Mapper
public interface OrderMapper {
	
	// 주문하기
	public void insert(OrderVO orderVO);
	
	// 주문 내역 조회
	public List<OrderDTO> selectAll(String sort);
}
