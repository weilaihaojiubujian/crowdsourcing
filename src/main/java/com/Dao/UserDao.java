package com.Dao;

import com.Dto.Merchants;
import com.Dto.People;
import com.Entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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
     * 通过用户名和密码登陆
     * @param username
     * @param password
     * @return
     */
    User selectByUsernamePassword(@Param("username")String username,@Param("password") String password);

    /**
     * 列出所有state=0的个人用户
     * @return
     */
    List<People> selectpeople();


    /**
     * 列出所有state=0的商家用户
     * @return
     */
    List<Merchants> selectmerchants();


    /**
     * 更新用户
     * @param user
     * @return
     */
    int updateUser(User user);


    /**
     * 更新用户状态
     * @param id
     * @return
     */
    int updateUserState(int id);


    /**
     * 删除用户
     * @param id
     * @return
     */
    int deleteUser(int id);


}
