package com.Dao;

import com.Entity.Pricingmodel;
import com.Entity.Tasktype;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 16:26 2018/11/23
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class PricingmodelDaoTest {


    @Resource
    private PricingmodelDao pricingmodelDao;

    @Test
    public void select()
    {
        List<Pricingmodel> t=pricingmodelDao.select();

        for (Pricingmodel i:t)
        {
            System.out.println("计费种类："+i);
        }


    }

    @Test
    public void selectByname()
    {
        String name="按单计费";
        Pricingmodel t=pricingmodelDao.selectByname(name);

        System.out.println("计费种类："+t);



    }

}
