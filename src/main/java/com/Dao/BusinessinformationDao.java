package com.Dao;

import com.Entity.Businessinformation;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 15:53 2018/11/8
 */
public interface BusinessinformationDao {

    /**
     * 插入商家信息
     * @param businessinformation
     * @return
     */
    int insertBusinessinformation(Businessinformation businessinformation);

    /**
     * 修改商家信息
     * @param businessinformation
     * @return
     */
    int updateBusinessinformation(Businessinformation businessinformation);

    /**
     * 查看商家信息
     * @param uid
     * @return
     */
    Businessinformation selectBusinessinformation(int uid);

    /**
     * 删除商家信息
     * @param id
     * @return
     */
    int deleteBusinessinformation(int id);

}
