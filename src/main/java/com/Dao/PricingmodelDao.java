package com.Dao;

import com.Entity.Pricingmodel;
import com.Entity.Tasktype;

import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 15:02 2018/11/8
 */
public interface PricingmodelDao {

    /**
     * 查看所有种类
     * @return
     */
    List<Pricingmodel> select();


    /**
     * 用名字查询
     * @param name
     * @return
     */
    Pricingmodel selectByname(String name);
}
