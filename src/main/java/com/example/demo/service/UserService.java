package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;


/**
 * Description TODO 用户服务层接口
 * Author Cloudr
 * Date 2020/1/7 17:05
 **/
public interface UserService {
   void save (User user);
   void delete(String name);
   Page<User> findAll(Pageable pageable);
   List<User> findByName(String name);
   Optional<User> findById(String id);
   List<User> findByNameLike(String name);
}

