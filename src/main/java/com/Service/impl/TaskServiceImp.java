package com.Service.impl;

import com.Dao.TaskDao;
import com.Entity.Task;
import com.Entity.Taskmessage;
import com.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 21:32 2018/11/12
 */
@Service
@Transactional
public class TaskServiceImp implements TaskService {

    @Autowired
    private TaskDao taskDao;

    @Override
    public boolean insertTask(Task task) {

        if(task==null) return false;
        int i=taskDao.insertTask(task);
        System.out.println(i);
        return i>0?true:false;

    }

    @Override
    public boolean insertTaskcompletetime(int id, Timestamp completetime) {
        if(id==0 || completetime==null)
        {
            return false;
        }
        int i=taskDao.insertTaskcompletetime(id,completetime);
        System.out.println(i);
        return i>0?true:false;

    }

    @Override
    public Task selectTask(int id) {

        if(id==0)
        {
            return null;
        }
        Task t=taskDao.selectTask(id);
        if(t!=null)
        {
            return t;
        }
        return null;
    }

    @Override
    public boolean deleteTask(int id) {
        if(id==0)
        {
            return false;
        }
        int i=taskDao.deleteTask(id);
        System.out.println(i);
        return i>0?true:false;

    }
}
