package com.healthrib.repository.user;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.healthrib.user.User;

public interface UserRepository extends MongoRepository<User, String> {

}
