package com.example.shoppro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.shoppro.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	@Query(value = "select * from customer where customer_email = :email and customer_password = :password", nativeQuery = true)
	public Customer customerLogin(@Param("email") String email, @Param("password") String password);
	
	public Boolean existsByCustomerEmail(String customerEmail);

}
