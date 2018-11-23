package com.Service.impl;

import com.Dao.AdministratorDao;
import com.Dao.UserDao;
import com.Entity.Administrator;
import com.Entity.User;
import com.Service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 19:05 2018/11/12
 */
@Service
@Transactional
public class LoginServiceImp implements LoginService {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserDao userDao;

    @Autowired
    private AdministratorDao administratorDao;

    @Override
    public User userLogin(String username, String password) {
        if(username==null||password==null||username.equals("")||password.equals(""))
        {
            return null;
        }
        User user=userDao.selectByUsernamePassword(username,password);

        log.info("LoginServiceImp"+"用户登录={}", user);
      if(user!=null)
      {
         return user;
      }
        return null;
    }

    @Override
    public Administrator administratorLogin(String username, String password) {

        if(username==null||password==null||username.equals("")||password.equals(""))
        {
            return null;
        }
        Administrator administrator=administratorDao.selectByUsernamePassword(username,password);
        log.info("LoginServiceImp"+"管理员登录={}", administrator);
        if(administrator!=null)
        {
            return administrator;
        }
        return null;
    }
}
