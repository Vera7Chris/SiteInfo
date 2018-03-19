package com.huanuo.npo.Dao;

import com.huanuo.npo.pojo.Airline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AirlineDao extends JpaRepository<Airline,Long>{
    @Query(value="select * from t_airline t where t.name = ?1",nativeQuery = true)
    List<Airline> findByName(String name);
}
