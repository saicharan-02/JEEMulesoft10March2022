package com.abc.ecom.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.ecom.entity.Order;
import com.abc.ecom.entity.OrderItem;
import com.abc.ecom.entity.Product;
import com.abc.ecom.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {
	
//	@Autowired
//	private ProductRepository productRepository;
	
	@Autowired
	private OrderRepository orderRepository;	
	
	@Autowired
	private ProductService productService;

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
