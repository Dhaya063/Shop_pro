package com.example.shoppro.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class LaptopCategory {
	
	@Id 
	private int categoryId;
	
	private String categoryName;
	
	private String categoryDescription;

}
