package com.Service.impl;

import com.Dao.BusinessinformationDao;
import com.Entity.Businessinformation;
import com.Service.BusinessinformationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 21:00 2018/11/12
 */
@Service
@Transactional
public class BusinessinformationServiceImp implements BusinessinformationService {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BusinessinformationDao businessinformationDao;

    @Override
    public boolean BusinessinformationRegistered(Businessinformation businessinformation) {
        if(businessinformation==null) return false;
        int i=businessinformationDao.insertBusinessinformation(businessinformation);
        log.info("BusinessinformationServiceImp"+"商家信息注册={}", i);
        return i>0?true:false;
    }

    @Override
    public boolean updateBusinessinformation(Businessinformation businessinformation) {
        if(businessinformation==null) return false;
        int i=businessinformationDao.updateBusinessinformation(businessinformation);
        log.info("BusinessinformationServiceImp"+"商家信息更新={}", i);
        return i>0?true:false;
    }
}
