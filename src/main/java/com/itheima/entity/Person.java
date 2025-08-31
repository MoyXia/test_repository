package com.itheima.entity;

/**
 * @author Bob
 * @date 2023/07/11
 * @description
 **/
public class Person {
    public String name;
    public int id;
    public int age;
    public boolean sex;
    public long house;

    public Person(String name, int id, int age, boolean sex, long house) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.sex = sex;
        this.house = house;
    }
}
