package com.abc.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.entity.Order;
import com.abc.entity.OrderItem;
import com.abc.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderRepository orderRepository;	
	
	@Override
	public Order saveOrder(Order order) {
				
		order.setOrderDate(LocalDate.now());
	
		List<OrderItem> orderItems = order.getOrderItems();
		
		//calculate the order total
		
		double orderTotalAmount = 0;
		
		for(OrderItem o : orderItems) {
			
			//Optional<Product> product = productRepository.findById(o.getProductId());
			Product product = productService.getProductById(o.getProductId());
			double unitPrice = product.getProductPrice();			
			int quantity = o.getQuantity();
			
			orderTotalAmount = orderTotalAmount+ (unitPrice*quantity);	
			
			o.setOrder(order);
			
		};	
		
		//if any gst or other tax calculate here and add to the orderTotalAmount
		
		order.setOrderAmount(orderTotalAmount);
		
		Order newOrder = orderRepository.save(order);		
		
		return newOrder;
	}

}
