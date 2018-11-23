package com.Service.impl;

import com.Dao.PricingmodelDao;
import com.Entity.Pricingmodel;
import com.Entity.Tasktype;
import com.Service.PricingmodelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 16:30 2018/11/23
 */
@Service
@Transactional
public class PricingmodelServiceImp implements PricingmodelService{


    @Autowired
    private PricingmodelDao pricingmodelDao;


    @Override
    public List<Pricingmodel> select() {


        List<Pricingmodel> t=pricingmodelDao.select();
        if (t!=null)
        {
            return t;
        }
        else
        {
            return null;
        }
    }

    @Override
    public Pricingmodel selectByname(String name) {
        if(name.equals("")||name==null )
        {
            return null;
        }
        Pricingmodel t=pricingmodelDao.selectByname(name);
        if(t!=null)
        {
            return t;
        }
        else
        {
            return null;
        }
    }
}
