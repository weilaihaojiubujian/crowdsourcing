package com.Dao;

import com.Entity.Taskmessage;
import com.Entity.Useraddress;
import com.Util.GeoHash;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 19:44 2018/11/11
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class TaskmessageDaoTest {


    @Resource
    private TaskmessageDao taskmessageDao;

    @Test
    public void  insertTaskmessage()
    {
        Taskmessage t=new Taskmessage();
        int uid=7;
        int ttid=1;
        int pmid=2;
        String name="帮忙收快递";
        String message="中午需要一个人帮忙收一下快递";
        String startingaddress="浙江省杭州市浙江科技学院小和山校区";
        String startingdetail="西和公寓507";
        String purposeaddress="浙江省杭州市浙江科技学院小和山校区";
        String purposedetail="东和公寓653";
        double weight=4.5;
        Double startinglocationX=89.11;
        Double startinglocationY=61.25;
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
        t.setStartingdetail(startingdetail);
        t.setPurposeaddress(purposeaddress);
        t.setPurposedetail(purposedetail);
        t.setWeight(weight);
        int i=taskmessageDao.insertTaskmessage(t);
        System.out.println(i);

    }

    @Test
    public void  updateTaskmessagestate()
    {
        int id=1;
        int state=2;

        int i=taskmessageDao.updateTaskmessagestate(id,state);
        System.out.println(i);
    }

    @Test
    public void selectTaskmessage()
    {
        int id=1;
        Taskmessage t=taskmessageDao.selectTaskmessage(id);
        System.out.println("任务信息："+t);
    }





    @Test
    public void  deleteTaskmessage()
    {

        int id=2;
        int i=taskmessageDao.deleteTaskmessage(id);
        System.out.println(i);
    }
}
