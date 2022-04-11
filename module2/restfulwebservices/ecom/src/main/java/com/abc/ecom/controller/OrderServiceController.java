package com.abc.ecom.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.ecom.entity.Order;
import com.abc.ecom.entity.OrderItem;
import com.abc.ecom.payload.OrderProducts;
import com.abc.ecom.payload.OrderReqPayload;
import com.abc.ecom.service.OrderService;

@RestController 
@RequestMapping("/order")
public class OrderServiceController {

	@Autowired
	private OrderService orderService;
	
	@PostMapping("/save")
	public ResponseEntity<?> placeOrder(@RequestBody OrderReqPayload reqPayload) {
		
		ResponseEntity<?> responseEntity = null;
		
		Order order = new Order();
		order.setCustomerId(reqPayload.getCustomerId());
		
		List<OrderProducts> orderProducts = reqPayload.getProducts();
		
		List<OrderItem> orderItems = new ArrayList<>();
		
		orderProducts.forEach(x-> {
			OrderItem orderItem = new OrderItem();
			orderItem.setProductId(x.getProductId());
			orderItem.setQuantity(x.getQuantity());
			orderItems.add(orderItem);
		});		
		
		order.setOrderItems(orderItems);
		
		Order newOrder = orderService.saveOrder(order);
		
		responseEntity = new ResponseEntity<>(newOrder, HttpStatus.CREATED);
		return responseEntity;
		
	}
	
	@PutMapping("/update/{orderId}")
	public ResponseEntity<?> placeOrder(@PathVariable("orderId") int orderId,@RequestBody OrderReqPayload reqPayload) {
		
		return null;
		
	}
	
}
