package com.korea.rest.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.korea.rest.mapper.ProductMapper;
import com.korea.rest.vo.OrderVO;
import com.korea.rest.vo.ProductVO;

@Repository
public class ProductDAO {
	
	@Autowired
	ProductMapper productMapper;
	
	// 상품 추가
	public void save(ProductVO productVO) {
		productMapper.insert(productVO);
	}
	
	public List<ProductVO> findAll(){
		return productMapper.selectAll();
	}
	
	// 재고 업데이트
	public void updateStock(OrderVO orderVO) {
		productMapper.updateStock(orderVO);
	}
	
	
}
