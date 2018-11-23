package com.Service;

import com.Entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 20:37 2018/11/13
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
@Transactional
public class UserServiceTest {

    private final Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserService userService;

    @Test
    @Rollback(false) //能对数据库里的表进行增删操作.原因：在操作数据时开启了事务，数据被放在iBATIS的一级缓存中，而操作之后没有提交事务
    public void userRegistered() {
        User u=new User();
        String username="wei";
        String password="123789";
        String phonenumber="137149770";
        String species="people";
        u.setUsername(username);
        u.setPassword(password);
        u.setPhonenumber(phonenumber);
        u.setSpecies(species);
        boolean i=userService.userRegistered(u);
        log.info("用户注册={}", i);

    }


       @Test
    public void selectUserById() {
        int id=2;
        User u=userService.selectUserById(id);
        log.info("用户={}", u);

    }




}
