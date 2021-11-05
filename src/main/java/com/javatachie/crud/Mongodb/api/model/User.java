package com.javatachie.crud.Mongodb.api.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection = "order_DB")
public class User {
	@Id
	private int id;
	private String name;
	private String gender;
	private Address address;
	private List<Product> products;
}
