package com.abc.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.abc.entity.Order;
import com.abc.entity.OrderItem;
import com.abc.model.Product;
import com.abc.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public Order saveOrder(Order order) {

//		RestTemplate restTemplate = new RestTemplate();

		order.setOrderDate(LocalDate.now());

		List<OrderItem> orderItems = order.getOrderItems();

		// calculate the order total

		double orderTotalAmount = 0;

		for (OrderItem o : orderItems) {

			// Optional<Product> product = productRepository.findById(o.getProductId());
			// Product product = productService.getProductById(o.getProductId());

			// Product product
			// =restTemplate.getForObject("http://localhost:8081/product/get/"+o.getProductId(),
			// Product.class);

			ResponseEntity<Product> responseEntity = restTemplate.getForEntity("http://product-service/product/get/" + o.getProductId(), Product.class);

			if (responseEntity.getStatusCode() == HttpStatus.OK) {

				Product product = responseEntity.getBody();

				double unitPrice = product.getProductPrice();
				int quantity = o.getQuantity();

				orderTotalAmount = orderTotalAmount + (unitPrice * quantity);

				o.setOrder(order);
			}

		}		

		// if any gst or other tax calculate here and add to the orderTotalAmount
		order.setOrderAmount(orderTotalAmount);
		Order newOrder = orderRepository.save(order);

		return newOrder;
	}

}
