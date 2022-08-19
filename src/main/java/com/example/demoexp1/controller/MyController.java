package com.example.demoexp1.controller;

import com.example.demoexp1.entity.User;
import com.example.demoexp1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class MyController {
  @Autowired
  private UserService userService;
    //get
  @GetMapping("")
    public ResponseEntity<?> getListUser() {
    List<User> users= userService.getListUser();
    return ResponseEntity.ok(users);
  }
  @GetMapping("/{id}")
  public ResponseEntity<?> getListUserID(@PathVariable int id) {
    User userID=userService.getUserID(id);
    return ResponseEntity.ok(userID);
  }
  //post
    @PostMapping("")
    public ResponseEntity<?> createUser() {
      return null;
    }
    //put

    }

