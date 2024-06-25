package com.example.shoppro.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Event {
	
	@Id
	private int EventId;
	private String EventName;
	private String EventStartDate;
	private String EventEndDate;
}
