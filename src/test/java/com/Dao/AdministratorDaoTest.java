package com.Dao;

import com.Entity.Administrator;
import com.Entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 18:44 2018/11/12
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class AdministratorDaoTest {

    @Resource
    private AdministratorDao administratorDao;

    @Test
    public void selectByUsernamePassword()
    {
        String username="wang";
        String password="123";
        Administrator a=administratorDao.selectByUsernamePassword(username,password);
        System.out.println("管理员:"+a);

    }
}
