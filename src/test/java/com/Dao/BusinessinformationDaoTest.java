package com.Dao;

import com.Entity.Businessinformation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 18:27 2018/11/11
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class BusinessinformationDaoTest {


    @Resource
    private BusinessinformationDao businessinformationDao;

    @Test
    public void insertBusinessinformation()
    {
        Businessinformation b=new Businessinformation();
        int uid=2;
        String name="汪宏斌";
        String address="西湖";
        String headname="王凯";
        String headidcard="3302124644644";
        b.setUid(uid);
        b.setName(name);
        b.setAddress(address);
        b.setHeadname(headname);
        b.setHeadidcard(headidcard);
        int i=businessinformationDao.insertBusinessinformation(b);
        System.out.println(i);
    }

    @Test
    public void updateBusinessinformation()
    {
        Businessinformation b=new Businessinformation();
        int uid=2;
        String address="宁波";
        b.setUid(uid);
        b.setAddress(address);
        int i=businessinformationDao.updateBusinessinformation(b);
        System.out.println(i);
    }

    @Test
    public void selectBusinessinformation()
    {
        int uid=2;
        Businessinformation b=businessinformationDao.selectBusinessinformation(uid);
        System.out.println("商家信息："+b);

    }

    @Test
    public void deleteBusinessinformation()
    {
           int id=2;
           int i=businessinformationDao.deleteBusinessinformation(id);
           System.out.println(i);
    }
}
