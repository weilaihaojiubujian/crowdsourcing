package com.Dao;

import com.Entity.Tasktype;
import com.Entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 16:04 2018/11/23
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class TasktypeDaoTest {

    @Resource
    private TasktypeDao tasktypeDao;

    @Test
    public void select()
    {
        List<Tasktype> t=tasktypeDao.select();

        for (Tasktype i:t)
        {
            System.out.println("任务种类："+i);
        }


    }

    @Test
    public void selectByname()
    {
        String name="收快递";
        Tasktype t=tasktypeDao.selectByname(name);

        System.out.println("任务种类："+t);



    }
}
