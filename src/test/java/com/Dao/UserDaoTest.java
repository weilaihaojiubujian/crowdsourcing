package com.Dao;

import com.Dto.Business;
import com.Dto.Person;
import com.Entity.Personinformation;
import com.Entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.text.ParseException;
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
      String username="wauhoi";
      String password="12326485";
      String phonenumber="1375810";
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
    public void selectPerson()
    {

        List<Person> u=userDao.selectPerson();
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
    public void selectuser()
    {


        List<User> u=userDao.selectuser();

        for (User i:u)
        {
            System.out.println("用户:"+i);
        }



    }

    @Test
    public void updateUserState()
    {
       int id=1;
        int i=userDao.updateUserState(id);
        System.out.println(i);
    }

    @Test
    public void updateUser() throws ParseException {
        User u=new User();
        int id=1;
        String password="123456";
        String phonenumber="1375770";
        String username = "yo";


        String name ="天";
        String sex = "女";

        String city= "宁海";
        String idcard= "7456154754";
        Personinformation p=new Personinformation();
        p.setBirthday("2018-11-15");
        Person q=new Person();
        q.setBirthday(p.getBirthday());
        q.setCity(city);
        q.setId(id);
        q.setUsername(username);
        q.setPassword(password);
        q.setPhonenumber(phonenumber);
        q.setName(name);
        q.setSex(sex);
        q.setIdcard(idcard);

        int i=userDao.updateUser(q);

        System.out.println(i);
    }
    @Test
    public void updateBusiness()  {
        User u=new User();
        int id=8;



        Business b=new Business();
        b.setId(id);
       b.setMoney((double) 10);


        int i=userDao.updateBusiness(b);

        System.out.println(i);
    }

    @Test
    public void deleteUser()
    {
       int id=7;
       int i=userDao.deleteUser(id);
        System.out.println(i);
    }


}
