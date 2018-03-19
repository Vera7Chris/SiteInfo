package com.huanuo.npo.Dao;

import com.huanuo.npo.pojo.SiteInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SiteInfoDao extends JpaRepository<SiteInfo,Long>{
    @Query(value="select * from #{#SiteInfo} b where b.enbid=?1", nativeQuery = true)
    List<SiteInfo> findByEnbid(int enbid);
}
