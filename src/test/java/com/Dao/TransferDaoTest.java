package com.Dao;

import com.Entity.Transfer;
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
 * @Date: Create in 17:16 2018/12/9
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class TransferDaoTest {

    @Resource
    private TransferDao transferDao;

    @Test
    public void insertTransfer()
    {
        Transfer t=new Transfer();
        t.setPrice(100);
        t.setUid_one(1);
        t.setUid_two(6);
        int i=transferDao.insertTransfer(t);
        System.out.println(i);

    }

    @Test
    public void selectbyUidOne()
    {
        List<Transfer> t=transferDao.selectbyUidOne(1);
        for (Transfer i:t)
        {
            System.out.println(i);
        }


    }
}
