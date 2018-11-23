package com.Service.impl;

import com.Dao.UserDao;
import com.Entity.User;
import com.Service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 19:22 2018/11/12
 */
@Service
@Transactional
public class UserServiceImp implements UserService {

    private final Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserDao userDao;


    @Override
    public boolean userRegistered(User user) {
        if(user==null) return false;
        int i=userDao.insertUser(user);
        log.info("UserServiceImp"+"用户注册={}", i);
        return i>0?true:false;
    }

    @Override
    public User selectUserById(int id) {
        User user=userDao.selectById(id);
        log.info("UserServiceImp"+"查询用户={}", user);
        if(user!=null)
        {
            return user;
        }
        return null;
    }


}
