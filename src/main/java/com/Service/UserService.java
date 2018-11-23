package com.Service;

import com.Entity.User;

import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 19:19 2018/11/12
 */
public interface UserService {


    /**
     * 用户注册
     * @param user
     */
    boolean userRegistered(User user);


    /**
     * 通过id查找用户
     * @param id
     * @return
     */
    User selectUserById(int id);



}
