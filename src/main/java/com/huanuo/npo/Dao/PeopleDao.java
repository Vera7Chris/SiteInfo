package com.huanuo.npo.Dao;

import com.huanuo.npo.pojo.People;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//对象的数据层操作
@Repository
public class PeopleDao {
    List<People> list=new ArrayList<People>();
    public People find(String name,int age){
        //返回一个数据操作后的对象
        People people=new People();
        people.setName(name);
        people.setAge(age);
        return people;
    }
    public List<People> get(){
        return list;
    }
    public List post(People people){
        list.add(people);
        return list;
    }
    public List delete(People people){
        for (int i=0;i<list.size();i++){
            String name=list.get(i).getName();
            if (name.equals(people.getName())){
                list.remove(list.get(i));
            }
        }
        return list;
    }


}
