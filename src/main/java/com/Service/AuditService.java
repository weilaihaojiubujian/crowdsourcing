package com.Service;

import com.Dto.Business;
import com.Dto.Person;

import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 19:54 2018/11/23
 */
public interface AuditService {

    /**
     * 列出所有state=0的个人用户
     * @return
     */
    List<Person> selectpeople();


    /**
     * 列出所有state=0的商家用户
     * @return
     */
    List<Business> selectmerchants();

    boolean updateUserState(int id);
}
