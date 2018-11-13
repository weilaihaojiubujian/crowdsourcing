package com.Service.impl;

import com.Dao.TaskmessageDao;
import com.Entity.Taskmessage;
import com.Service.TaskmessageService;
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

    @Autowired
    private TaskmessageDao taskmessageDao;

    @Override
    public boolean TaskmessageRelease(Taskmessage taskmessage) {
        if(taskmessage==null) return false;
        int i=taskmessageDao.insertTaskmessage(taskmessage);
        System.out.println(i);
        return i>0?true:false;
    }

    @Override
    public boolean updateTaskmessagestate(int id, int state) {

        if(id==0 || state==0)
        {
            return false;
        }

        int i=taskmessageDao.updateTaskmessagestate(id,state);
        System.out.println(i);
        return i>0?true:false;
    }

    @Override
    public Taskmessage selectTaskmessage(int id) {

        if(id==0)
        {
            return null;
        }
        Taskmessage t=taskmessageDao.selectTaskmessage(id);
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
        System.out.println(i);
        return i>0?true:false;
    }
}
