package com.huanuo.npo.service;

import com.huanuo.npo.Config.Car;
import com.huanuo.npo.Dao.PeopleDao;
import com.huanuo.npo.pojo.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PeopleServiceTest {
    @Autowired
    PeopleDao peopleDao;
    @Autowired
    Car car;
    public List<People> get(){
        car.Run();
        return peopleDao.get();
    }
    public List post(String name,int age){
        People peopleTest=new People();
        peopleTest.setName(name);
        peopleTest.setAge(age);
        return peopleDao.post(peopleTest);
    }
    public List delete(String name){
        People peopleTest=new People();
        peopleTest.setName(name);
        return peopleDao.delete(peopleTest);
    }
}
