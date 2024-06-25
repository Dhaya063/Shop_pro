package com.example.shoppro.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Laptop {
	
	@Id
	private int laptopId;
	
	private String laptopName;
	
	private String laptopDescription;
	
	private String laptopModel;

	@Lob
	private String laptopImage;
	
	private int categoryId;
	
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "categoryId", insertable = false, updatable = false)
	private LaptopCategory category;
	
	
	@ManyToMany
	@JsonIgnore
	@JoinTable(name = "carts_products", 
			joinColumns = @JoinColumn(name = "laptop_id"), 
	inverseJoinColumns = @JoinColumn(name = "cart_id"))
	private List<Cart> addedCarts = new ArrayList<>();
	
	
	public void addLaptop(Cart cart) {
		addedCarts.add(cart);
	}

	public void removeLaptop(Cart cart) {
		addedCarts.remove(cart);
	}
	
	

}
