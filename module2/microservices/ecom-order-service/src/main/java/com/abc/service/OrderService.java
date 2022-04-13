package com.abc.service;

import com.abc.entity.Order;
import com.abc.model.OrderDetails;

public interface OrderService {

	public Order saveOrder(Order order);
	
	//get order by id
	public OrderDetails getOrderById(int orderId);
	
	//get all orders
	
}
