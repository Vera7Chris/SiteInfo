package com.huanuo.npo.service;

import com.huanuo.npo.Dao.PeopleDao;
import com.huanuo.npo.pojo.People;
//对象的业务逻辑层操作
public class PeopleService {
    private PeopleDao peopleDao;
    {//静态代码块
        peopleDao= new PeopleDao();
    }
    public People get(String name,int age) throws Exception {
        //退出一个Java方法的方法的两种方式：
        //1、抛出异常
        //2、return
        if (name.equals(null)){
            throw new Exception("NAME SHOULD NOT BE NULL");
        }
        return peopleDao.find(name,age);
    }
    public People changeName(String name,int age)throws Exception{
        if (name.equals(null)){
            throw new Exception("NAME SHOULD NOT BE NULL");
        }
        return peopleDao.find(name,age);
    }
}
