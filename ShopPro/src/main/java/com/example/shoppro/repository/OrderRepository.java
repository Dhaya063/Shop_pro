package com.example.shoppro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shoppro.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
	
	public List<Order> getByCustomerId(int customerId);

}
