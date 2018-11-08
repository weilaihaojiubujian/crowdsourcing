package com.Dao;

import com.Entity.User;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 14:39 2018/11/8
 */
public interface UserDao {


    /**
     *插入用户
     * @param user
     * @return
     */
    int insertUser(User user);

    /**
     * 通过id查询用户
     * @param id
     * @return
     */

    User selectById(int id);


    /**
     * 通过用户名查找用户
     * @param username
     * @return
     */
    User selectByUsername(String username);


    /**
     * 更新用户
     * @param user
     * @return
     */
    int updateUser(User user);


    /**
     * 删除用户
     * @param id
     * @return
     */
    int deleteUser(int id);


}
