package com.ninandres.workmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ninandres.workmongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
