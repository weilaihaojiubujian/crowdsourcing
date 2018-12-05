package com.Service;

import com.Dto.Business;
import com.Dto.Person;
import com.Dto.Taskinformation;
import com.github.pagehelper.PageInfo;

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
     * 列出所有未审核的任务信息
     * @return
     */
    List<Taskinformation> selectTaskinformation();

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
    PageInfo<Person> selectPerson(int pageNum);
}
