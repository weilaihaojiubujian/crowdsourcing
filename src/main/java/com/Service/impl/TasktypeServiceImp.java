package com.Service.impl;

import com.Dao.TasktypeDao;
import com.Entity.Tasktype;
import com.Service.TasktypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 16:15 2018/11/23
 */
@Service
@Transactional
public class TasktypeServiceImp implements TasktypeService{

    @Autowired
    private TasktypeDao tasktypeDao;

    @Override
    public List<Tasktype> select() {

        List<Tasktype> t=tasktypeDao.select();
        if (t!=null)
        {
            return t;
        }
        else
        {
            return null;
        }

    }

    @Override
    public Tasktype selectByname(String name) {

        if(name.equals("")||name==null )
        {
            return null;
        }
        Tasktype t=tasktypeDao.selectByname(name);
        if(t!=null)
        {
            return t;
        }
        else
        {
            return null;
        }

    }
}
