package com.koreak.tier.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.koreak.tier.mapper.ProductMapper;
import com.koreak.tier.vo.ProductVO;

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
	
	
}
