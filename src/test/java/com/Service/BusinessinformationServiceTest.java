package com.Service;

import com.Entity.Administrator;
import com.Entity.Businessinformation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 21:06 2018/11/13
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
@Transactional
public class BusinessinformationServiceTest {

    private final Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private BusinessinformationService businessinformationService;

    @Test
    @Rollback(false) //能对数据库里的表进行增删操作.原因：在操作数据时开启了事务，数据被放在iBATIS的一级缓存中，而操作之后没有提交事务
    public void BusinessinformationRegistered() {
        Businessinformation b=new Businessinformation();
        int uid=6;
        String name="王斌";
        String address="西湖";
        String headname="王挺";
        String headidcard="330124644644";
        b.setUid(uid);
        b.setName(name);
        b.setAddress(address);
        b.setHeadname(headname);
        b.setHeadidcard(headidcard);
        boolean i=businessinformationService.BusinessinformationRegistered(b);

        log.info("商家信息注册={}", i);

    }

    @Test
    @Rollback(false) //能对数据库里的表进行增删操作.原因：在操作数据时开启了事务，数据被放在iBATIS的一级缓存中，而操作之后没有提交事务
    public void updateBusinessinformation() {
        Businessinformation b=new Businessinformation();
        int uid=2;
        String address="上海";
        b.setUid(uid);
        b.setAddress(address);
        boolean i=businessinformationService.updateBusinessinformation(b);
        log.info("商家信息更新={}", i);
    }


}
