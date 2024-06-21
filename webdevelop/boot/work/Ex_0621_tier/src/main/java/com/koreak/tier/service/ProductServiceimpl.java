package com.koreak.tier.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koreak.tier.dao.ProductDAO;
import com.koreak.tier.vo.ProductVO;

@Service
public class ProductServiceimpl implements ProductService{

	@Autowired
	ProductDAO productDAO;
	
	@Override
	public void register(ProductVO productVO) {
		productDAO.save(productVO);
		
	}

	@Override
	public List<ProductVO> getList() {
		return productDAO.findAll();
		
	}

	
}
