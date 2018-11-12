package com.Service.impl;

import com.Dao.BusinessinformationDao;
import com.Entity.Businessinformation;
import com.Service.BusinessinformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 21:00 2018/11/12
 */
@Service
public class BusinessinformationServiceImp implements BusinessinformationService {

    @Autowired
    private BusinessinformationDao businessinformationDao;

    @Override
    public boolean BusinessinformationRegistered(Businessinformation businessinformation) {
        if(businessinformation==null) return false;
        int i=businessinformationDao.insertBusinessinformation(businessinformation);
        System.out.println(i);
        return i>0?true:false;
    }

    @Override
    public boolean updateBusinessinformation(Businessinformation businessinformation) {
        if(businessinformation==null) return false;
        int i=businessinformationDao.updateBusinessinformation(businessinformation);
        System.out.println(i);
        return i>0?true:false;
    }
}
