package com.Service;

import com.Dto.Business;
import com.Dto.Person;
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
     * 列出所有用户
     * @return
     */
    List<User> selectuser();
    /**
     *
     * @param p
     * @return
     */
    boolean updateUser(Person p);

    /**
     * 更新商家信息
     * @param b
     * @return
     */
    boolean updateBusiness(Business b);


    /**
     * 删除用户
     * @param id
     * @return
     */
    boolean deleteUser(int id);
}
