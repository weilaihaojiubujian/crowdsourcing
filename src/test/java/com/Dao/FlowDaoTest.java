package com.Dao;

import com.Entity.Businessinformation;
import com.Entity.Flow;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 22:46 2018/12/18
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class FlowDaoTest {

    @Resource
    private FlowDao flowDao;
    @Test
    public void insert()
    {
        Flow flow = new Flow();
        flow.setId("181217CH5H7FXXGC");
        Timestamp completetimee=new Timestamp(new Date().getTime());
        flow.setCreatetime(completetimee);
        flow.setFlownum("2018121722001427170500791709");
        flow.setTfid("181218GKP4DA037C");

        flow.setPaidamount(Double.parseDouble("100"));

        flow.setPaidmethod(1);

        int i=flowDao.insert(flow);
    }
}
