package com.example.shoppro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shoppro.entity.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Integer> {

}
