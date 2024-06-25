package com.example.shoppro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.shoppro.entity.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop, Integer> {
	
	 @Query(value = "select * from laptop where laptop_id = :laptopId", nativeQuery = true)
	 public Laptop getLaptop(@Param("laptopId") int laptopId);

}
