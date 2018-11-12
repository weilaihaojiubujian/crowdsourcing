package com.Service;

import com.Entity.Administrator;
import com.Entity.User;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 17:57 2018/11/12
 */
public interface LoginService {


    /**
     * 用户通过账号密码登陆
     * @param username
     * @param password
     * @return
     */
    User userLogin(String username,String password);


    /**
     * 管理员通过账号密码登陆
     * @param username
     * @param password
     * @return
     */
    Administrator administratorLogin(String username,String password);




}
