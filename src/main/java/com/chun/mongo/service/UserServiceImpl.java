package com.chun.mongo.service;

import com.chun.mongo.dao.UserDao;
import com.chun.mongo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Optional;

/**
 * @Author chun
 * @Date 2019/8/8 10:13
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    public List<User> listUser(){
        return userDao.findAll();
    }

    public Optional<User> getById(String id){
        return userDao.findById(id);
    }

    public void addUser(User user){
        user.setId(null);
        userDao.save(user);
    }

    public void deleteById(String id){
        userDao.deleteById(id);
    }

    public void update(User user){
        if(StringUtils.isEmpty(user.getId())){
            throw new RuntimeException("用户不存在");
        }else{
            if(userDao.findById(user.getId()).isPresent()){
                userDao.save(user);
            };
        }
    }
}
