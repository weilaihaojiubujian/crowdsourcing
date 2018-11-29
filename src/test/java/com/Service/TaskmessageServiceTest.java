package com.Service;

import com.Entity.Businessinformation;
import com.Entity.Taskmessage;
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

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 21:15 2018/11/13
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
@Transactional
public class TaskmessageServiceTest {

    private final Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private TaskmessageService taskmessageService;

    @Test
    @Rollback(false) //能对数据库里的表进行增删操作.原因：在操作数据时开启了事务，数据被放在iBATIS的一级缓存中，而操作之后没有提交事务
    public void TaskmessageRelease() {
        Taskmessage t=new Taskmessage();
        int uid=6;
        int ttid=1;
        int pmid=2;
        String name="帮忙收快递";
        String message="中午需要一个人帮忙收一下快递";
        String startingaddress="浙江省杭州市浙江科技学院小和山校区西和公寓507";

        String purposeaddress="浙江省杭州市浙江科技学院小和山校区东和公寓653";

        double weight=6.5;
        Double startinglocationX=89.11;
        Double startinglocationY=51.25;
        Double purposelocationX=75.12;
        Double purposelocationY=45.23;
        t.setStartinggeohash(new GeoHash().encode(startinglocationX,startinglocationY));
        t.setPurposegeohash(new GeoHash().encode(purposelocationX,purposelocationY));
        t.setStartinglocationX(startinglocationX);
        t.setStartinglocationY(startinglocationY);
        t.setPurposelocationX(purposelocationX);
        t.setPurposelocationY(purposelocationY);
        t.setUid(uid);
        t.setTtid(ttid);
        t.setPmid(pmid);
        t.setName(name);
        t.setMessage(message);
        t.setStartingaddress(startingaddress);

        t.setPurposeaddress(purposeaddress);

        t.setWeight(weight);
        boolean i=taskmessageService.TaskmessageRelease(t);
        log.info("任务具体信息发布={}", i);

    }

    @Test
    @Rollback(false) //能对数据库里的表进行增删操作.原因：在操作数据时开启了事务，数据被放在iBATIS的一级缓存中，而操作之后没有提交事务
    public void updateTaskmessagestate() {
        int id=3;
        int state=1;
        boolean i=taskmessageService.updateTaskmessagestate(id,state);
        System.out.println(i);
        log.info("任务状态更新={}", i);
    }

    @Test
    public void selectTaskmessage() {

        int id=1;
        Taskmessage i=taskmessageService.selectTaskmessage(id);
        log.info("任务信息={}", i);

    }

    @Test
    @Rollback(false) //能对数据库里的表进行增删操作.原因：在操作数据时开启了事务，数据被放在iBATIS的一级缓存中，而操作之后没有提交事务
    public void deleteTaskmessage() {

        int id=3;
        boolean i=taskmessageService.deleteTaskmessage(id);
        log.info("任务删除={}", i);

    }

}
