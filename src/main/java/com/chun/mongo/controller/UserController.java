package com.chun.mongo.controller;

import com.chun.mongo.model.User;
import com.chun.mongo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @Author chun
 * @Date 2019/8/8 10:37
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("users")
    public void listUser(){
        List<User> users = userService.listUser();
        System.out.println(users);
    }

    @PostMapping("/user/add")
    public void add(User user){
        userService.addUser(user);
    }

    @DeleteMapping("/user/delete/{id}")
    public void delete(@PathVariable("id") String id){
        userService.deleteById(id);
    }

    @GetMapping("/user/{id}")
    public void getUser(@PathVariable("id") String id){
        Optional<User> user = userService.getById(id);
        System.out.println(user);
    }
}
