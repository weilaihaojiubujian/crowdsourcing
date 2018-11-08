package com.Dao;

import com.Entity.Personinformation;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 15:10 2018/11/8
 */
public interface PersoninformationDao {


    /**
     * 插入个人信息
     * @param personinformation
     * @return
     */
    int insertPersoninformation(Personinformation personinformation);


    /**
     * 修改个人信息
     * @param personinformation
     * @return
     */
    int updatePersoninformation(Personinformation personinformation);


    /**
     * 查看个人信息
     * @param uid
     * @return
     */
    Personinformation selectPersoninformation(int uid);



    /**
     * 删除个人信息
     * @param id
     * @return
     */
    int deletePersoninformation(int id);
}
