package com.korea.rest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.korea.rest.vo.ProductVO;

@Service
public interface ProductService {
	
	// 상품추가
	public void register(ProductVO productVO);
	
	// 상품 조회
	public List<ProductVO> getList();
}
