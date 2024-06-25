package com.example.shoppro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shoppro.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
