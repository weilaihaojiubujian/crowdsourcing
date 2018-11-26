package com.Service;

import com.Dto.Business;
import com.Dto.Person;
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
 * @Date: Create in 19:59 2018/11/23
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
@Transactional
public class AuditServiceTest {

    private final Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private AuditService auditService;

    @Test
    public void selectpeople() {

        List<Person> u = auditService.selectpeople();
        for (Person i : u) {
            log.info("个人用户={}", u);
        }


    }

    @Test
    public void selectmerchants() {
        List<Business> u = auditService.selectmerchants();
        for (Business i : u) {
            log.info("商家用户={}", i);
        }


    }

    @Test
    @Rollback(false) //能对数据库里的表进行增删操作.原因：在操作数据时开启了事务，数据被放在iBATIS的一级缓存中，而操作之后没有提交事务
    public void updateUserState() {
        int id=1;
        boolean i=auditService.updateUserState(id);
        log.info("审核用户通过={}", i);

    }

    @Test
    public void selectPerson() {

        List<Person> u = auditService.selectPerson();
        for (Person i : u) {
            log.info("个人用户={}", i);
        }


    }
}
