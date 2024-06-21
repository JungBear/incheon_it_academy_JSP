package com.koreak.tier.vo;

import lombok.Data;

@Data
public class ProductVO {
	private int productId, productStock, productPrice;
	private String productName, registerDate, updateDate;
}
