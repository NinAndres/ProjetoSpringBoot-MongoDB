package com.ninandres.workmongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ninandres.workmongodb.domain.User;
import com.ninandres.workmongodb.repository.UserRepository;
import com.ninandres.workmongodb.services.exception.ObjectNotFoundException;

@Service
public class UserService {

  @Autowired
  private UserRepository repo;

  public List<User> findAll() {
    return repo.findAll();
  }

  public User findById(String id) {
    Optional<User> user = repo.findById(id);
    return user.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
  }
}
