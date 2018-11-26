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

    /**
     * 审核用户
     * @param id
     * @return
     */
    boolean updateUserState(int id);


    /**
     * 列出所有state=1的用户，按评价从低到高排列
     * @return
     */
    List<Person> selectPerson();
}
