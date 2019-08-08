package com.chun.mongo.service;

import com.chun.mongo.model.User;

import java.util.List;
import java.util.Optional;

/**
 * @Author chun
 * @Date 2019/8/8 10:12
 */
public interface UserService {

    List<User> listUser();

    Optional<User> getById(String id);

    void addUser(User user);

    void deleteById(String id);

    void update(User user);
}
