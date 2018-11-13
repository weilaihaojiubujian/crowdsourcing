package com.Service;

import com.Entity.Task;
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

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 21:55 2018/11/13
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
@Transactional
public class TaskServiceTest {

    private final Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private TaskService taskService;


    @Test
    @Rollback(false) //能对数据库里的表进行增删操作.原因：在操作数据时开启了事务，数据被放在iBATIS的一级缓存中，而操作之后没有提交事务
    public void insertTask() {

        Task t=new Task();
        int uid=2;
        int tmid=1;
        double price=44.23;
        Timestamp createtime=new Timestamp(new Date().getTime());

        t.setCreatetime(createtime);
        t.setUid(uid);
        t.setTmid(tmid);
        t.setPrice(price);

        boolean i=taskService.insertTask(t);
        log.info("任务接受={}", i);

    }

    @Test
    @Rollback(false) //能对数据库里的表进行增删操作.原因：在操作数据时开启了事务，数据被放在iBATIS的一级缓存中，而操作之后没有提交事务
    public void insertTaskcompletetime() {
        int id=6;
        Timestamp completetimee=new Timestamp(new Date().getTime());
        boolean i=taskService.insertTaskcompletetime(id,completetimee);
        log.info("提交任务完成时间={}", i);
    }

    @Test
    public void selectTask() {

        int id=1;
        Task i=taskService.selectTask(id);
        log.info("任务={}", i);
    }

    @Test
    @Rollback(false) //能对数据库里的表进行增删操作.原因：在操作数据时开启了事务，数据被放在iBATIS的一级缓存中，而操作之后没有提交事务
    public void deleteTask() {
        int id=6;
        boolean i=taskService.deleteTask(id);
        log.info("任务删除={}", i);

    }
}
