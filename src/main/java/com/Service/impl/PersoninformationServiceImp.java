package com.Service.impl;

import com.Dao.PersoninformationDao;
import com.Entity.Personinformation;
import com.Service.PersoninformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 20:18 2018/11/12
 */
@Service
@Transactional
public class PersoninformationServiceImp implements PersoninformationService {

    @Autowired
    private PersoninformationDao personinformationDao;

    @Override
    public boolean PersoninformationRegistered(Personinformation personinformation) {
        if(personinformation==null) return false;
        int i=personinformationDao.insertPersoninformation(personinformation);
        System.out.println(i);
        return i>0?true:false;
    }

    @Override
    public boolean updatePersoninformation(Personinformation personinformation) {
        if(personinformation==null) return false;
        int i=personinformationDao.updatePersoninformation(personinformation);
        System.out.println(i);
        return i>0?true:false;
    }
}
