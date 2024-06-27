package com.koreak.tier.dto;

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
}
