package com.Dao;

import com.Dto.Business;
import com.Dto.Person;
import com.Entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 12:24 2018/11/10
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class UserDaoTest {

    @Resource
    private UserDao userDao;

    @Test
    public void insertUser()
    {
        User u=new User();
      String username="weilai";
      String password="123";
      String phonenumber="13758149770";
      String species="person";
      u.setUsername(username);
      u.setPassword(password);
      u.setPhonenumber(phonenumber);
      u.setSpecies(species);
      int i=userDao.insertUser(u);
        System.out.println(i);



    }

    @Test
    public void selectById()
    {
        int id=1;
        User u=userDao.selectById(id);
        System.out.println("用户："+u);

    }


    @Test
    public void selectByUsername()
    {
        String username="weilai";
        User u=userDao.selectByUsername(username);
        System.out.println("用户:"+u);

    }

    @Test
    public void selectByUsernamePassword()
    {
        String username="weilai";
        String password="12345";
        User u=userDao.selectByUsernamePassword(username,password);
        System.out.println("用户:"+u);

    }
    @Test
    public void selectByUsernamePasswordToId()
    {
        String username="qw";
        String password="as";
        User u=userDao.selectByUsernamePasswordToId(username,password);
        System.out.println("用户:"+u);

    }

    @Test
    public void selectpeopleinformation()
    {

        int id=2;
       Person u=userDao.selectpeopleinformation(id);


            System.out.println("个人用户:"+u);



    }

    @Test
    public void selectpeople()
    {

        List<Person> u=userDao.selectpeople();
        for (Person i:u)
        {
            System.out.println("个人用户:"+i);
        }


    }

    @Test
    public void selectmerchants()
    {

        List<Business> u=userDao.selectmerchants();
        for (Business i:u)
        {
            System.out.println("商家用户:"+i);
        }


    }

    @Test
    public void selectbusinessinformation()
    {

        int id=7;
        Business u=userDao.selectbusinessinformation(id);

            System.out.println("商家用户:"+u);



    }
    @Test
    public void updateUserState()
    {
       int id=1;
        int i=userDao.updateUserState(id);
        System.out.println(i);
    }

    @Test
    public void updateUser()
    {
        User u=new User();
        int id=2;
        String password="123456";
        String phonenumber="1375770";

        u.setId(id);
        u.setPassword(password);
        u.setPhonenumber(phonenumber);

        int i=userDao.updateUser(u);
        System.out.println(i);
    }


    @Test
    public void deleteUser()
    {
       int id=3;
       int i=userDao.deleteUser(id);
        System.out.println(i);
    }


}
