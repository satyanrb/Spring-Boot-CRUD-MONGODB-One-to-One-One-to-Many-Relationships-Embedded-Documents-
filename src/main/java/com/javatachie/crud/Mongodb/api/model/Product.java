package com.javatachie.crud.Mongodb.api.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Product {

	private String productName;
	private int quantity;
	private int price;
}
