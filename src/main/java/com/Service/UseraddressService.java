package com.Service;

import com.Entity.User;
import com.Entity.Useraddress;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 19:21 2018/11/17
 */
public interface UseraddressService {

    /**
     * 定位
     * @param useraddress
     * @return
     */
    boolean UseraddressRegistered(Useraddress useraddress);


    /**
     * 用用户id查找
     * @param uid
     * @return
     */
    List<Useraddress> selectByUid(int uid);

    /**
     *
     * @param uid
     * @param distance
     * @return
     */
    List<Useraddress> selectbyposition(@Param("uid") int uid, @Param("distance") double distance );

    /**
     * 删除地址
     * @param id
     * @return
     */
    boolean deleteAddress(int id);
}
