package com.example.shoppro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Customer {

	
	@Id
	private int customerId;

	private String customerName;
	
	private String customerEmail;
	
	private String customerPassword;
	
	private String customerPhoneNumber;
}
