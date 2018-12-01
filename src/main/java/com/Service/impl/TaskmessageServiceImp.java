package com.Service.impl;

import com.Dao.TaskmessageDao;
import com.Entity.Taskmessage;
import com.Service.TaskmessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 21:11 2018/11/12
 */
@Service
@Transactional
public class TaskmessageServiceImp implements TaskmessageService {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TaskmessageDao taskmessageDao;

    @Override
    public boolean TaskmessageRelease(Taskmessage taskmessage) {
        if(taskmessage==null) return false;
        int i=taskmessageDao.insertTaskmessage(taskmessage);
        System.out.println(i);
        log.info("TaskmessageServiceImp"+"任务具体信息发布={}", i);
        return i>0?true:false;
    }

    @Override
    public boolean updateTaskmessagestate(int id) {

        if(id==0)
        {
            return false;
        }

        int i=taskmessageDao.updateTaskmessagestate(id);
        System.out.println(i);
        log.info("TaskmessageServiceImp"+"更新任务状态={}", i);
        return i>0?true:false;
    }

    @Override
    public Taskmessage selectTaskmessage(int id) {

        if(id==0)
        {
            return null;
        }
        Taskmessage t=taskmessageDao.selectTaskmessage(id);
        log.info("TaskmessageServiceImp"+"查看任务具体信息={}", t);
        if(t!=null)
        {
            return t;
        }
        return null;
    }

    @Override
    public boolean deleteTaskmessage(int id) {

        if(id==0)
        {
            return false;
        }
        int i=taskmessageDao.deleteTaskmessage(id);
        log.info("TaskmessageServiceImp"+"删除任务具体信息={}", i);
        return i>0?true:false;
    }
}
