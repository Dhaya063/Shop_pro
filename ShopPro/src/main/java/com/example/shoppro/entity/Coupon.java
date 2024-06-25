package com.example.shoppro.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Coupon {

	@Id
	private int CouponId;

	private String CouponName;
	
	private int CouponDiscount;
	
	private String expiryDate;
	
	private int eventId;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "eventId", insertable = true, updatable = false)
	private Event eventDetails;
	
	
	
}
