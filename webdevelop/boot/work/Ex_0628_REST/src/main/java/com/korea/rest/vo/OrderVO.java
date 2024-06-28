package com.korea.rest.vo;

import lombok.Data;

@Data
public class OrderVO {
	
	private int orderId, productId, productCount;
	private String orderDate;
}
