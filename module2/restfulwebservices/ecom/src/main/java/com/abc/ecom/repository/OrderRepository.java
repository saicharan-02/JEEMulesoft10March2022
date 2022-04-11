package com.abc.ecom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.abc.ecom.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Integer> {

	@Query("Select o from Order o where o.customerId = :cId")
	public List<Order> getOrdersForCustomer(@Param("cId") int customerId);
}
