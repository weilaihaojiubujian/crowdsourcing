package com.Service;

import com.Entity.Pricingmodel;
import com.Entity.Tasktype;

import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 16:29 2018/11/23
 */
public interface PricingmodelService {

    /**
     * 查找所有种类
     * @return
     */
    List<Pricingmodel> select();

    /**
     * 通过name查找
     * @param name
     * @return
     */
    Pricingmodel selectByname(String name);
}
