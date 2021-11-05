package com.javatachie.crud.Mongodb.api.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.javatachie.crud.Mongodb.api.model.User;

@Repository
public interface FlipkartRepository extends MongoRepository<User, Integer>{

	List<User> findByName(String name);
	
	@Query("{'Address.city':?0}")
	List<User> findByCity(String city);
}
