package com.Dao;

import com.Dto.Taskinformation;
import com.Entity.Task;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 20:38 2018/11/11
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class TaskDaoTest {

    @Resource
    private TaskDao taskDao;

    @Test
    public void insertTask()
    {
        Task t=new Task();
        int uid=2;
        int tmid=1;
        double price=54.23;
        Timestamp createtime=new Timestamp(new Date().getTime());

        t.setCreatetime(createtime);
        t.setUid(uid);
        t.setTmid(tmid);
        t.setPrice(price);

        int i=taskDao.insertTask(t);
        System.out.println(i);
    }

    @Test
    public void insertTaskcompletetime()
    {
        int id=1;
        Timestamp completetimee=new Timestamp(new Date().getTime());
        int i=taskDao.insertTaskcompletetime(id,completetimee);
        System.out.println(i);
    }

    @Test
    public void  selectTask()
    {
        int id=1;
        Task t=taskDao.selectTask(id);
        System.out.println("任务："+t);

    }

    @Test
    public void  selectTaskById()
    {
        int id=1;
        Taskinformation t=taskDao.selectTaskByUId(id);
        System.out.println("任务："+t);

    }

    @Test
    public void  selectTaskAllByUId()
    {
        int id=6;
        List<Taskinformation> t=taskDao.selectTaskAllByUId(id);
        for (Taskinformation i:t)
        {
            System.out.println("任务："+i);
        }


    }



    @Test
    public void  selectTaskByUid()
    {
        int id=1;
        Task t=taskDao.selectTaskByUid(id);
        System.out.println("任务："+t);

    }

    @Test
    public void  selectTaskBytmid()
    {
        int id=7;
        Task t=taskDao.selectTaskBytmid(id);
        System.out.println("任务："+t);

    }

    @Test
    public void  deleteTask()
    {
        int id=2;
        int i=taskDao.deleteTask(id);
        System.out.println(i);
    }
}
