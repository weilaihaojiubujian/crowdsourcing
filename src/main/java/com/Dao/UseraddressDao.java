package com.Dao;

import com.Entity.Useraddress;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 17:17 2018/11/16
 */
public interface UseraddressDao {

    /**
     * 插入定位
     * @param useraddress
     * @return
     */
    int insertUseraddress(Useraddress useraddress);


    /**
     * 用id查找
     * @param id
     * @return
     */
    Useraddress selectById(int id);


    /**
     * 用用户id查找
     * @param uid
     * @return
     */
    List<Useraddress> selectByUid(int uid);

    List<Useraddress> selectByPos(@Param("uid") int uid
                                 );

    /**
     * 删除地址
     * @param id
     * @return
     */
    int deleteAddress(int id);



}
