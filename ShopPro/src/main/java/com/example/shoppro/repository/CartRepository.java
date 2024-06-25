package com.example.shoppro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.shoppro.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {
	
	@Query(value = "select * from cart where customer_id = :customerId", nativeQuery = true)
    public Cart getByUserId(@Param("customerId") int customerId);

    @Query(value = "select id from cart where customer_id = :customerId", nativeQuery = true)
    public int getCartId(@Param("customerId") int customerId);

}
