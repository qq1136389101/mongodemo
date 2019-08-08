package com.chun.mongo.dao;

import com.chun.mongo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author chun
 * @Date 2019/8/8 10:08
 */
@Repository
public interface UserDao extends MongoRepository<User, String> {
}
