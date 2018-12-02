package com.Dao;

import com.Dto.Taskinformation;
import com.Entity.BankAccount;
import com.Entity.Message;
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
 * @Date: Create in 20:02 2018/12/1
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class MessageDaoTest {

    @Resource
    private MessageDao messageDao;

    @Test
    public void insertMessage()
    {
        Message m=new Message();
        int uid=1;
        int tmid=8;
        Timestamp createtime=new Timestamp(new Date().getTime());

        m.setUid(uid);
        m.setTmid(tmid);
        m.setCreatetime(createtime);
        int i=messageDao.insertMessage(m);

        System.out.println(i);

    }

    @Test
    public void selectMessageByUid()
    {

        int uid=1;
        List<Taskinformation> i=messageDao.selectMessageByUid(uid);
        for (Taskinformation t:i)
        {
            System.out.println("任务消息:0"+t);
        }

    }

    @Test
    public void selectMessage()
    {

        int id=2;
        Message i=messageDao.selectMessage(id);
        System.out.println(i);
    }

    @Test
    public void updateMessageState()
    {

        int id=2;
        int i=messageDao.updateMessageState(id);
        System.out.println(i);
    }

    @Test
    public void deleteMessage()
    {

        int id=1;
        int i=messageDao.deleteMessage(id);
        System.out.println(i);
    }

}
