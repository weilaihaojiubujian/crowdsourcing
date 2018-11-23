package com.Service;

import com.Entity.Pricingmodel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 16:38 2018/11/23
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
@Transactional
public class PricingmodelServiceTest {

    private final Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private PricingmodelService pricingmodelService;

    @Test
    public void select()
    {
        List<Pricingmodel> t=pricingmodelService.select();

        for (Pricingmodel i:t)
        {

            log.info("计费种类={}", i);
        }


    }

    @Test
    public void selectByname()
    {
        String name="按单计费";
        Pricingmodel t=pricingmodelService.selectByname(name);


        log.info("计费种类={}", t);



    }
}
