package com.javaapp.demo;

import org.springframework.data.mongodb.repository.MongoRepository;
@SuppressWarnings("java:S5961")


public interface ShoeRepository extends MongoRepository<Shoe, String>{
    
    Shoe findByModel(String model);
}
