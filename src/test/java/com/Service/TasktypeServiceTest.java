package com.Service;

import com.Entity.Tasktype;
import com.Entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 16:34 2018/11/23
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
@Transactional
public class TasktypeServiceTest {

    private final Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private  TasktypeService tasktypeService;

    @Test
    public void select() {
        List<Tasktype> t=tasktypeService.select();

        for (Tasktype i:t)
        {

            log.info("任务种类={}", i);
        }



    }

    @Test
    public void selectByname() {
        String name="收快递";
        Tasktype t=tasktypeService.selectByname(name);
        log.info("任务种类={}", t);

    }


}
