package com.abc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}
