package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * Description TODO 用户服务层实现类
 * Author Cloudr
 * Date 2020/1/7 17:15
 **/
@Service//表明该类是一个服务层类
public class UserServiceImpl implements UserService {

    @Resource //默认按照名称进行装配 当注解写在字段上 就默认按照字段名进行查找
    private UserRepository userRepository;

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void delete(String id) {
        userRepository.deleteById(id);//deleteById:根据主键来删除 并不是按照字段"id"删除
    }

    @Override
    public Page<User> findAll() {
        return null;
    }

    @Override
    public List<User> findByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public Optional<User> findById(String id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> findByNameLike(String name) {
        return userRepository.findByNameLike(name);
    }
}
