package com.huanuo.npo.controller;

import com.huanuo.npo.pojo.People;
import com.huanuo.npo.service.PeopleService;
import com.huanuo.npo.service.PeopleServiceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RestController
public class PeopleConTest {
    /*
    类型：大驼峰写法
    变量名：小驼峰写法（除第一个单词首字母小写，其他大写）
     */
    @Autowired
    PeopleServiceTest peopleService;
    @GetMapping("qian")
    public List<People> get(){
        return peopleService.get();
    }
    @PostMapping("qian")
    public List post(@RequestBody Map<String,String> map){

        String name;
        int age;
        name=map.get("name");
        age=Integer.valueOf( map.get("age"));
        return peopleService.post(name,age);
    }
    @DeleteMapping("/qian/{name}")
    public List delete(@PathVariable  String name){
        return peopleService.delete(name);
    }
}
