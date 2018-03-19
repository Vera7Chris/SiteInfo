package com.huanuo.npo.controller;

import com.huanuo.npo.Dao.DataTestDao;
import com.huanuo.npo.pojo.DataTest;
import com.huanuo.npo.pojo.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataTestCtr {
    @Autowired
    public DataTestDao dataTestDao;
    @PostMapping("happy")
    public Integer test(){
        DataTest dataTest=new DataTest();
        dataTest.setName("happy");
        dataTestDao.save(dataTest);
        return 200;
    }
    @GetMapping("happy")
    public List<DataTest> findall(){
        return dataTestDao.findAll();
    }
}
