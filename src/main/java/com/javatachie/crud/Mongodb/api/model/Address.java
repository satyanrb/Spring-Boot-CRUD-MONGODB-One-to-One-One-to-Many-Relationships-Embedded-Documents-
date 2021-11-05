package com.javatachie.crud.Mongodb.api.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Address {

	private String city;
	private String state;
	private String pincode;
}
