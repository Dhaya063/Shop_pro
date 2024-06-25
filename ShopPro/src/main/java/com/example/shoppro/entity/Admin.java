package com.example.shoppro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Admin {

	
	@Id
	private int adminId;

	private String  adminName;
	
	private String adminEmail;
	
	private String adminPassword;
}
