package com.Service.impl;

import com.Dao.UserDao;
import com.Dto.Business;
import com.Dto.Person;
import com.Service.AuditService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 19:55 2018/11/23
 */
@Service
@Transactional
public class AuditServiceImp implements AuditService{
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserDao userDao;


    @Override
    public List<Person> selectpeople() {

        List<Person> p=userDao.selectpeople();
        log.info("AuditServiceImp"+"个人信息={}", p);
        if (p!=null)
        {
            return p;
        }
        else {
            return null;
        }


    }

    @Override
    public List<Business> selectmerchants() {

        List<Business> m=userDao.selectmerchants();
        log.info("AuditServiceImp"+"商家信息={}", m);
        if (m!=null)
        {
            return m;
        }
        else {
            return null;
        }


    }

    @Override
    public boolean updateUserState(int id) {
        if(id==0)
            return false;
        int i=userDao.updateUserState(id);
        log.info("AuditServiceImp"+"审核用户通过={}", i);
        return i>0?true:false;
    }

    @Override
    public List<Person> selectPerson() {


        List<Person> p=userDao.selectPerson();
        log.info("AuditServiceImp"+"个人信息={}", p);
        if (p!=null)
        {
            return p;
        }
        else {
            return null;
        }

    }
}
