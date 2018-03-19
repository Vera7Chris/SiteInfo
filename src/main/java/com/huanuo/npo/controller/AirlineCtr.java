package com.huanuo.npo.controller;

import com.huanuo.npo.Dao.AirlineDao;
import com.huanuo.npo.pojo.Airline;
import com.huanuo.npo.pojo.AirlinePK;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AirlineCtr {
    @Autowired
    public AirlineDao airlineDao;
    @PostMapping("air")
    public Integer post(){
        AirlinePK pk = new AirlinePK("PEK", "SHA");
        Airline airline=new Airline(pk,"good");
        airlineDao.save(airline);
        return 200;
    }
    @GetMapping("air")
    public List<Airline> get(){
        return airlineDao.findByName("good");
    }
}
