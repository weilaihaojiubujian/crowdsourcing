package com.Service.impl;

import com.Dao.TasktypeDao;
import com.Entity.Tasktype;
import com.Service.TasktypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TasktypeDao tasktypeDao;

    @Override
    public List<Tasktype> select() {

        List<Tasktype> t=tasktypeDao.select();
        log.info("TasktypeServiceImp"+"任务种类={}", t);
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
        log.info("TasktypeServiceImp"+"任务种类={}", t);
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
