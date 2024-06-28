package com.korea.rest.dto;

import lombok.Data;

@Data
public class OrderDTO {
	private int productId;
	private String productName;
	private int productStock;
	private int productPrice;
	private String registerDate;
	private String updateDate;
	private int orderId;
	private int orderPrice;
	private int productCount;
	private String orderDate;
}
