package com.example.demo.model;

/**
 * Description TODO 带bootstrap和jQuery的web应用
 * Author Cloudr
 * Date 2020/1/14 13:34
 **/
public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}
