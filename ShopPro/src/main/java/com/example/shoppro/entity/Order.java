package com.example.shoppro.entity;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Order {

	@Id
	private int OrderId;
	
	private int laptopId;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "laptopId", insertable = false, updatable = false)
	private Laptop laptopDetails;
	
	private int customerId;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "customerId", insertable = false, updatable = false)
	private Customer customerDetails;
	
	private int quantity;
	
	private double totalAmount;
	
	
	
	

	
	
}
