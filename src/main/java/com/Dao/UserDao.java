package com.Dao;

import com.Dto.Business;
import com.Dto.Person;
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
     * 通过用户名和密码查询序号
     * @param username
     * @param password
     * @return
     */

    User selectByUsernamePasswordToId(@Param("username")String username,@Param("password") String password);

    /**
     * 列出所有state=0的个人用户
     * @return
     */
    List<Person> selectpeople();


    /**
     * 列出所有state=1的用户，按评价从低到高排列
     * @return
     */
    List<Person> selectPerson();


    /**
     * 查询个人用户信息
     * @param id
     * @return
     */
    Person selectpeopleinformation(int id);
    /**
     * 列出所有state=0的商家用户
     * @return
     */
    List<Business> selectmerchants();


    /**
     * 查询商家信息
     * @param id
     * @return
     */
    Business selectbusinessinformation(int id);

    /**
     *
     * @param p
     * @return
     */
    int updateUser(Person p);


    /**
     * 更新商家信息
     * @param b
     * @return
     */
    int updateBusiness(Business b);
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
