package com.Dao;

import com.Entity.Personinformation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.Date;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 14:23 2018/11/11
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class PersoninformationDaoTest {

    @Resource
    private PersoninformationDao personinformationDao;

    @Test
    public void insertPersoninformation() throws ParseException {
        Personinformation p=new Personinformation();
        int uid=2;
        String name="汪宏斌";
        String sex="男";
        String city="杭州";
        String birthday="2018-11-15";
        String idcard="330283199710211419";
        p.setUid(uid);
        p.setName(name);
        p.setSex(sex);
        p.setCity(city);
        p.setBirthday(birthday);
        p.setIdcard(idcard);
        int i=personinformationDao.insertPersoninformation(p);
        System.out.println(i);
    }

    @Test
    public void updatePersoninformation()
    {
        Personinformation p=new Personinformation();
        int uid=2;
        String name="王凯";
        p.setUid(uid);
        p.setName(name);
        int i=personinformationDao.updatePersoninformation(p);
        System.out.println(i);

    }

    @Test
    public void selectPersoninformation()
    {
        int uid=2;
        Personinformation p=personinformationDao.selectPersoninformation(uid);
        System.out.println("个人信息："+p);

    }


    @Test
    public void deletePersoninformation()
    {
        int id=3;
        int i=personinformationDao.deletePersoninformation(id);
        System.out.println(i);


    }
}
