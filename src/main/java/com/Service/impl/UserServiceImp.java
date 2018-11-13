package com.Service.impl;

import com.Dao.UserDao;
import com.Entity.User;
import com.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 19:22 2018/11/12
 */
@Service
@Transactional
public class UserServiceImp implements UserService {


    @Autowired
    private UserDao userDao;


    @Override
    public boolean userRegistered(User user) {
        if(user==null) return false;
        int i=userDao.insertUser(user);
        System.out.println(i);
        return i>0?true:false;
    }

    @Override
    public User selectUserById(int id) {
        User user=userDao.selectById(id);
        if(user!=null)
        {
            return user;
        }
        return null;
    }
}
