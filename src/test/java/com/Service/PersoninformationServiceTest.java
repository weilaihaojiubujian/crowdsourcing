package com.Service;

import com.Entity.Personinformation;
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

import java.text.ParseException;
import java.util.Date;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 20:48 2018/11/13
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
@Transactional
public class PersoninformationServiceTest {

    private final Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private PersoninformationService personinformationService;


    @Test
    @Rollback(false) //能对数据库里的表进行增删操作.原因：在操作数据时开启了事务，数据被放在iBATIS的一级缓存中，而操作之后没有提交事务
    public void PersoninformationRegistered() throws ParseException {
        Personinformation p=new Personinformation();
        int uid=2;
        String name="江闲人";
        String sex="男";
        String city="绍兴";
        String birthday="2018-11-15";
        String idcard="3302211419";
        p.setUid(uid);
        p.setName(name);
        p.setSex(sex);
        p.setCity(city);
        p.setBirthday(birthday);
        p.setIdcard(idcard);
        boolean i=personinformationService.PersoninformationRegistered(p);
        log.info("用户信息注册={}", i);

    }


    @Test
    @Rollback(false) //能对数据库里的表进行增删操作.原因：在操作数据时开启了事务，数据被放在iBATIS的一级缓存中，而操作之后没有提交事务
    public void updatePersoninformation() {

        Personinformation p=new Personinformation();
        int uid=2;
        String name="梁思涛";
        p.setUid(uid);
        p.setName(name);
        boolean i=personinformationService.updatePersoninformation(p);
        log.info("用户信息更新={}", i);
    }

}
