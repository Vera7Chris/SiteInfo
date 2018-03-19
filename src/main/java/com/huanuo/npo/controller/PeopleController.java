package com.huanuo.npo.controller;

import com.huanuo.npo.pojo.People;
import com.huanuo.npo.service.PeopleService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
//service的控制层
@RestController
public class PeopleController {
    PeopleService peopleService=new PeopleService();
    @GetMapping("people")
    public People get() throws Exception{
        return peopleService.get("happy",7);
    }
    @GetMapping("change")
    public People change() throws Exception{
        return peopleService.changeName("twohappy",7);
    }
    @GetMapping("test")
    public People getPeople() throws Exception{
        System.out.println("Get");
        return peopleService.get("happy",7);

    }
    @PostMapping("test")
    public People setPeople() throws Exception{
        System.out.println("Post");
        return peopleService.get("happy",7);
    }
    @DeleteMapping("test")
    public People deletePeople() throws Exception{
        System.out.println("Delete");
        return peopleService.get("happy",7);
    }
}
