package com.ninandres.workmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ninandres.workmongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
