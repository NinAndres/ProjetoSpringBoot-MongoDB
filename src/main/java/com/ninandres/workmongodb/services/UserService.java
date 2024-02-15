package com.ninandres.workmongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ninandres.workmongodb.domain.User;
import com.ninandres.workmongodb.repository.UserRepository;

@Service
public class UserService {

  @Autowired
  private UserRepository repo;

  public List<User> findAll() {
    return repo.findAll();
  }
}
