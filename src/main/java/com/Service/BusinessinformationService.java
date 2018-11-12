package com.Service;

import com.Entity.Businessinformation;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 20:34 2018/11/12
 */
public interface BusinessinformationService {


    /**
     * 商家注册身份信息
     * @param businessinformation
     */
    boolean BusinessinformationRegistered(Businessinformation businessinformation);


    /**
     * 更新商家信息
     * @param businessinformation
     */
    boolean updateBusinessinformation(Businessinformation businessinformation);
}
