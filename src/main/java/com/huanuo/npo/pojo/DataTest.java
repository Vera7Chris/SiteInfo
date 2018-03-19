package com.huanuo.npo.pojo;

import javax.persistence.*;

/*
标记这是一个可被持久化的类
 */
@Entity
@Table(name = "DataTest")
public class DataTest {
    /*
            标记当前为数据表的主键
    */
    @Id
    @GeneratedValue
    int id;
    String name;
    String age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
