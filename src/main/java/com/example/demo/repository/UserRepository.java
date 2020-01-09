package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 *@Descriptuion TODO 用户repository
**/
public interface UserRepository extends JpaRepository<User,String> {

//   相当于：select * from user where name='name';
    List<User> findByName(String name);

    //    相当于：select * from user where name like 'name';
    List<User> findByNameLike(String name);




}

