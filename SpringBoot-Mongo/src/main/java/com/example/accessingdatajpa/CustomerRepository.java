package com.example.accessingdatajpa;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, Long> {

	List<Customer> findByLastName(String lastName);

	Customer findById(String id);
}
