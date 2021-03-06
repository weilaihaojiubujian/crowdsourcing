package com.Dao;

import com.Entity.Tasktype;

import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 15:01 2018/11/8
 */
public interface TasktypeDao {

    /**
     * 查找所有种类
     * @return
     */
    List<Tasktype> select();


    /**
     * 通过name查找
     * @param name
     * @return
     */
    Tasktype selectByname(String name);

}
