package com.example.shoppro.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cart {

	@Id
	private int CartId;
	
	private int customerId;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "customerId", insertable = false, updatable = false)
	private Customer customerDetails;
	
	@ManyToMany(mappedBy = "addedCarts")
	private List<Laptop> productsInCart = new ArrayList<>();
	
	public Cart(Integer customerId) {
		this.customerId = customerId;
	}

	public Cart() {

	}
	
	

	
	
	
}
