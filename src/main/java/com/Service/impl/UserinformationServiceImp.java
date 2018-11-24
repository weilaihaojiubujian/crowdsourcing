package com.Service.impl;

import com.Dao.UserDao;
import com.Dto.Business;
import com.Dto.Person;
import com.Service.UserinformationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 20:17 2018/11/24
 */
@Service
@Transactional
public class UserinformationServiceImp implements UserinformationService {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserDao userDao;

    @Override
    public Person selectpeopleinformation(int id) {
        if(id==0)
            return null;
        Person p=userDao.selectpeopleinformation(id);
        log.info("UserinformationServiceImp"+"查询个人用户信息={}", p);
        if (p!=null)
        {
            return p;
        }
        else
        {
            return null;
        }


    }

    @Override
    public Business selectbusinessinformation(int id) {
        if(id==0)
            return null;
        Business b=userDao.selectbusinessinformation(id);
        log.info("UserinformationServiceImp"+"查询商家用户信息={}", b);
        if(b!=null)
        {
            return b;

        }
        else {
            return null;
        }


    }
}
