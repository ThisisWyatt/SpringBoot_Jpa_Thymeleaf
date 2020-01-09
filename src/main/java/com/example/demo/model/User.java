package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Description TODO 用户表
 * Author Cloudr
 * Date 2020/1/7 15:45
 **/
@Entity //每个持久化的POJO类都是一个实体Bean,使用@Entity来进行声明
@Table(name = "user")//映射到数据库中的数据表，如果没有系统会使用默认值(实体类的短类名）
public class User {
    private String id;
    private String name;
    private String password;
    @Id//指定表的主键
    private String id_test;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
