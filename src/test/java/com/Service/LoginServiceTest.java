package com.Service;

import com.Entity.Administrator;
import com.Entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 20:02 2018/11/13
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
@Transactional
public class LoginServiceTest {

    private final Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private LoginService loginService;


    @Test
    public void userLogin() {

        String username="weilai";
        String password="12345";
        User u=loginService.userLogin(username,password);
        System.out.println("用户："+u);
       // log.info("u={}", u);
        log.debug("u={}", u);
    }

    @Test
    public void administratorLogin() {
        String username="wang";
        String password="123";
        Administrator a=loginService.administratorLogin(username,password);
        log.info("a={}", a);

    }
}
