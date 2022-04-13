package com.abc.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderDetails {

	private int orderId;
	private LocalDate orderDate;
	private double orderAmount;	
	private List<OrderItemDetails> orderItems = new ArrayList<>();	
	private Customer customer;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}
	public List<OrderItemDetails> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<OrderItemDetails> orderItems) {
		this.orderItems = orderItems;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}	
	
}
