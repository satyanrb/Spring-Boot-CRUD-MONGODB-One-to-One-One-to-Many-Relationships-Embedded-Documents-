package com.javatachie.crud.Mongodb.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatachie.crud.Mongodb.api.model.User;
import com.javatachie.crud.Mongodb.api.repository.FlipkartRepository;

@RestController
public class OrderController {

	@Autowired
	private FlipkartRepository repo;
	
	@PostMapping("/placeOder")
	public String addOrder(@RequestBody User user) {
		repo.save(user);
		return "Order placed Successfully";
	}
	
	@GetMapping("/getAllOrders")
	public List<User> getAllOrders() {
		return repo.findAll();
	}
	
	@GetMapping("/getOrderById/{id}")
	public Optional<User> getOrderById(@PathVariable int id) {
		return repo.findById(id);
	}
	
	@GetMapping("/getOrderByName/{name}")
	public List<User> getOrderByName(@PathVariable String name) {
		return repo.findByName(name);
	}
	
	@GetMapping("/getOrderByCity/{city}")
	public List<User> getOrderByCity(@PathVariable String city){
		return repo.findByCity(city);
	}
}
