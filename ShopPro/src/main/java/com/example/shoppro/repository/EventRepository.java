package com.example.shoppro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shoppro.entity.Event;

public interface EventRepository extends JpaRepository<Event, Integer> {

}
