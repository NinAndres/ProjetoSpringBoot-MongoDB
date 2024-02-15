package com.ninandres.workmongodb.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ninandres.workmongodb.domain.User;
import com.ninandres.workmongodb.dto.UserDTO;
import com.ninandres.workmongodb.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

  @Autowired
  private UserService service;

  @GetMapping
  public ResponseEntity<List<UserDTO>> findAll() {
    List<User> list = service.findAll();
    List<UserDTO> listDTO = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
    return ResponseEntity.ok().body(listDTO);
  }
}
