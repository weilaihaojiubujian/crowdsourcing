package com.Service;

import com.Entity.Tasktype;

import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 16:14 2018/11/23
 */
public interface TasktypeService {

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
