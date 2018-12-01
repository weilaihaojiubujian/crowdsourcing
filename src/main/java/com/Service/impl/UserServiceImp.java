package com.Service.impl;

import com.Dao.UserDao;
import com.Dto.Business;
import com.Dto.Person;
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

    @Override
    public User selectByUsernamePasswordToId(String username, String password) {


        if(username.equals("")||username==null ||password.equals("")||password==null )
        {
            return null;
        }
        User u=userDao.selectByUsernamePasswordToId(username,password);
        log.info("UserServiceImp"+"查询用户={}", u);
        if (u!=null)
        {
            return u;
        }
        else {
            return null;
        }


    }

    @Override
    public List<User> selectuser() {

        List<User> u=userDao.selectuser();
        log.info("UserServiceImp"+"查询所有用户={}", u);

        if (u!=null)
        {
            return u;
        }
        else {
            return null;
        }
    }

    @Override
    public boolean updateUser(Person p) {
        if(p==null) return false;
        int i=userDao.updateUser(p);
        log.info("UserServiceImp"+"个人用户更新={}", i);
        return i>0?true:false;


    }

    @Override
    public boolean updateBusiness(Business b) {
        if(b==null) return false;
        int i=userDao.updateBusiness(b);
        log.info("UserServiceImp"+"商家用户更新={}", i);
        return i>0?true:false;
    }


    @Override
    public boolean deleteUser(int id) {
        if(id==0)
        {
            return false;
        }
        int i=userDao.deleteUser(id);
        log.info("UserServiceImp"+"删除用户={}", i);
        return i>0?true:false;
    }


}
