package com.Service;

import com.Entity.Personinformation;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 19:41 2018/11/12
 */
public interface PersoninformationService {

    /**
     * 用户个人信息注册
     * @param personinformation
     */
    boolean PersoninformationRegistered(Personinformation personinformation);


    /**
     * 用户更新个人信息
     * @param personinformation
     */
    boolean updatePersoninformation(Personinformation personinformation);

    /**
     * 查看个人信息
     * @param uid
     * @return
     */
    Personinformation selectPersoninformation(int uid);
}
