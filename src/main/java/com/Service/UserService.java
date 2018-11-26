package com.Service;

import com.Entity.User;
import org.apache.ibatis.annotations.Param;

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



    /**
     * 通过用户名和密码查询序号
     * @param username
     * @param password
     * @return
     */

    User selectByUsernamePasswordToId(@Param("username")String username, @Param("password") String password);

    /**
     * 删除用户
     * @param id
     * @return
     */
    boolean deleteUser(int id);
}
