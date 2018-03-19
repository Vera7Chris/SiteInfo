package com.huanuo.npo.controller;

import com.huanuo.npo.Dao.SiteInfoDao;
import com.huanuo.npo.pojo.SiteInfo;
import com.huanuo.npo.service.SiteInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SiteInfoCtr {
    @Autowired
    SiteInfoService siteInfoService;
    @Autowired
    SiteInfoDao siteInfoDao;
    List<SiteInfo> siteinfo=new ArrayList<SiteInfo>();
@PostMapping("siteinfo")
    public Integer csvsave() throws Exception{
    long currenttime=System.currentTimeMillis();
    List<SiteInfo> siteinfo=siteInfoService.readcsv("D:\\Project\\twohappy\\cfg_siteinfo.csv");

    for(SiteInfo sf : siteinfo ){
//        System.out.println(sf.toString());
        siteInfoDao.save(sf);
    }
    System.out.println(System.currentTimeMillis()-currenttime);
    return 200;
}
}
