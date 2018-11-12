package com.Dao;

import com.Entity.Administrator;
import com.Entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 14:57 2018/11/8
 */
public interface AdministratorDao {

    /**
     * 管理员通过账号密码登陆
     * @param username
     * @param password
     * @return
     */
    Administrator selectByUsernamePassword(@Param("username")String username, @Param("password") String password);

}
