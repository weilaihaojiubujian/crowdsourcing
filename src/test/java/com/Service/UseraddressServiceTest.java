package com.Service;

import com.Entity.User;
import com.Entity.Useraddress;
import com.Util.GeoHash;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 20:20 2018/11/17
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
@Transactional
public class UseraddressServiceTest {

    private final Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UseraddressService useraddressService;

    @Test
    @Rollback(false) //能对数据库里的表进行增删操作.原因：在操作数据时开启了事务，数据被放在iBATIS的一级缓存中，而操作之后没有提交事务
    public void UseraddressRegistered() {
        Useraddress u=new Useraddress();
        int uid=1;


        String startingaddress="浙江省杭州市浙江科技学院小和山校区";
        String startingdetail="西和公寓507";


        Double startinglocationX=59.11;
        Double startinglocationY=65.25;

        u.setGeohash(new GeoHash().encode(startinglocationX,startinglocationY));


        u.setLocationX(startinglocationX);
        u.setLocationY(startinglocationY);
        u.setUid(uid);
        u.setAddress(startingaddress);
        u.setDetail(startingdetail);
        Timestamp createtime=new Timestamp(new Date().getTime());
        u.setCreatetime(createtime);
        boolean i=useraddressService.UseraddressRegistered(u);
        log.info("地址定位={}", i);

    }

    @Test
    public void selectbyposition() {
        int uid = 7;
        double distance=1000000000;
        List<Useraddress> t = useraddressService.selectbyposition(uid,distance);
        for (Useraddress i : t) {
            log.info("用户={}", i);

        }


    }


}
