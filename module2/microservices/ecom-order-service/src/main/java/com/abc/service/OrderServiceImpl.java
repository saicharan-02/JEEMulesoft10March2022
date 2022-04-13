package com.abc.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.abc.entity.Order;
import com.abc.entity.OrderItem;
import com.abc.exception.ResourceNotFoundException;
import com.abc.model.Customer;
import com.abc.model.OrderDetails;
import com.abc.model.OrderItemDetails;
import com.abc.model.Product;
import com.abc.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private ProductService productService;
	
	@Autowired
	private CustomerService customerService;

	@Override
	public Order saveOrder(Order order) {
		
		order.setOrderDate(LocalDate.now());
		
		List<OrderItem> orderItems = order.getOrderItems();

		// calculate the order total
		double orderTotalAmount = 0;

		for (OrderItem o : orderItems) {

			Product product = productService.getProductDetails(o.getProductId());

			double unitPrice = product.getProductPrice();
			int quantity = o.getQuantity();

			orderTotalAmount = orderTotalAmount + (unitPrice * quantity);
			o.setOrder(order);

		}

		// if any gst or other tax calculate here and add to the orderTotalAmount
		order.setOrderAmount(orderTotalAmount);
		Order newOrder = orderRepository.save(order);

		return newOrder;
	}

	@Override
	public OrderDetails getOrderById(int orderId) {
	
	    Optional<Order> optionalOrder = orderRepository.findById(orderId);
	    if(optionalOrder.isEmpty()) {
	    	throw new ResourceNotFoundException("Order not existing with id: "+orderId);
	    }
	    
	    Order order = optionalOrder.get();
	    
	    OrderDetails orderDetails = new OrderDetails();
	    orderDetails.setOrderId(order.getOrderId());
	    orderDetails.setOrderAmount(order.getOrderAmount());
	    orderDetails.setOrderDate(order.getOrderDate());
	    
	    int customerId =  order.getCustomerId(); // you have to find out customer details (customerName , email, addr etc..)
	    List<OrderItem> orderItemsEntity = order.getOrderItems(); // you have to find out all order items details (itemName, unitPrice ,qunaity etc..)
	    
	    // get customer details 
	    Customer customer = customerService.getCustomerDetails(customerId);   
	    orderDetails.setCustomer(customer);    
		    
	    //get all order items details and set to orderDetails...
	    List<OrderItemDetails> orderItemDetialsList = new ArrayList<>(); // empty
	    
	    orderItemsEntity.forEach(item-> {
	    	int productId = item.getProductId();
	    	int quantity = item.getQuantity();
	    	Product product = productService.getProductDetails(productId);
	    	String pName = product.getProductName();
	    	double uPrice = product.getProductPrice();
	    	
	    	OrderItemDetails orderItem = new OrderItemDetails();
	    	orderItem.setProductId(productId);
	    	orderItem.setProductName(pName);
	    	orderItem.setUnitPrice(uPrice);
	    	orderItem.setQuantity(quantity);
	    	
	    	orderItemDetialsList.add(orderItem);
	    	
	    });	  
	    	    
	    orderDetails.setOrderItems(orderItemDetialsList);		
		return orderDetails;
	}

}
