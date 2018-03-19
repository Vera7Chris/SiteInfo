package com.huanuo.npo.controller;

import com.huanuo.npo.pojo.People;
import com.huanuo.npo.service.PeopleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//service的控制层
@Controller
public class PeopleControllerNorest {
    PeopleService peopleService=new PeopleService();
    //@GetMapping("people")
    public People get() throws Exception{
        return peopleService.get("happy",7);
    }
   // @GetMapping("change")
    public People change() throws Exception{
        return peopleService.changeName("twohappy",7);
    }
}
