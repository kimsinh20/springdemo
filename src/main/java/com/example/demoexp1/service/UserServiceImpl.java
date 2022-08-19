package com.example.demoexp1.service;

import com.example.demoexp1.entity.User;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImpl implements UserService{
    private static ArrayList<User> users= new ArrayList<User>();
    static {
        users.add(new User(1,"phan kim sinh","thanh hoa",20));
        users.add(new User(2,"phan xuan nhat","ha noi",18));
        users.add(new User(3,"mai thi thanh","thanh hoa",46));
    }

    @Override
    public List<User> getListUser() {
        return users;
    }

    @Override
    public User getUserID(int id) {
        for(User u:users) {
            if(u.getId()==id) {
               return u;
            }
        }
        return null;
    }
}
