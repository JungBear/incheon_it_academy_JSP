package com.koreak.tier.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.koreak.tier.vo.ProductVO;

@Service
public interface ProductService {
	
	// 상품추가
	public void register(ProductVO productVO);
	
	// 상품 조회
	public List<ProductVO> getList();
}
