package com.example.demoexp1.service;

import com.example.demoexp1.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> getListUser();
    User getUserID(int id);
}
