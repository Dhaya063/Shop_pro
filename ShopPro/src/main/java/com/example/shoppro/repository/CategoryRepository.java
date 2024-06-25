package com.example.shoppro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shoppro.entity.LaptopCategory;

public interface CategoryRepository extends JpaRepository<LaptopCategory, Integer> {

}
