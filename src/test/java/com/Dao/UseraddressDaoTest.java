package com.Dao;

import com.Entity.Taskmessage;
import com.Entity.Useraddress;
import com.Util.GeoHash;
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
 * @Date: Create in 13:53 2018/11/17
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class UseraddressDaoTest {

    @Resource
    private UseraddressDao useraddressDao;

    @Test
    public void  insertUseraddress()
    {
        Useraddress u=new Useraddress();
        int uid=6;


        String startingaddress="浙江省杭州市浙江科技学院小和山校区";
        String startingdetail="西和公寓507";


        Double startinglocationX=89.11;
        Double startinglocationY=45.25;

        u.setGeohash(new GeoHash().encode(startinglocationX,startinglocationY));


        u.setLocationX(startinglocationX);
        u.setLocationY(startinglocationY);
        u.setUid(uid);
        u.setAddress(startingaddress);
        u.setDetail(startingdetail);
        Timestamp createtime=new Timestamp(new Date().getTime());
        u.setCreatetime(createtime);

        int i=useraddressDao.insertUseraddress(u);
        System.out.println(i);

    }

    @Test
    public void  selectById()
    {
        int id=1;

        Useraddress i=useraddressDao.selectById(id);
        System.out.println("用户地址"+i);

    }

    @Test
    public void selectByPos() {
        int uid = 6;

        List<Useraddress> t = useraddressDao.selectByPos(uid);
        for (Useraddress i : t) {
            System.out.println("用户地址" + i);
            System.out.println(i.getLocationX());
            System.out.println(i.getLocationY());
        }
    }
    @Test
    public void  selectByUid()
    {
        int uid=6;

        List<Useraddress> i=useraddressDao.selectByUid(uid);
        for (Useraddress u:i)
        {
            System.out.println("用户地址"+u);

        }


    }

    @Test
    public void  deleteAddress()
    {

        int id=2;
        int i=useraddressDao.deleteAddress(id);
        System.out.println(i);
    }
}
