package com.Service.impl;

import com.Dao.TaskDao;
import com.Dto.Taskinformation;
import com.Entity.Task;
import com.Entity.Taskmessage;
import com.Service.TaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 21:32 2018/11/12
 */
@Service
@Transactional
public class TaskServiceImp implements TaskService {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TaskDao taskDao;

    @Override
    public boolean insertTask(Task task) {

        if(task==null) return false;
        int i=taskDao.insertTask(task);
        log.info("TaskServiceImp"+"任务接受={}", i);
        return i>0?true:false;

    }

    @Override
    public boolean insertTaskcompletetime(int uid, Timestamp completetime) {
        if(uid==0 || completetime==null)
        {
            return false;
        }
        int i=taskDao.insertTaskcompletetime(uid,completetime);
        log.info("TaskServiceImp"+"任务完成时间更新={}", i);
        return i>0?true:false;

    }

    @Override
    public Task selectTask(int id) {

        if(id==0)
        {
            return null;
        }
        Task t=taskDao.selectTask(id);
        log.info("TaskServiceImp"+"查看任务={}", t);
        if(t!=null)
        {
            return t;
        }
        return null;
    }

    @Override
    public Taskinformation selectTaskByUId(int uid) {
        if(uid==0)
        {
            return null;
        }
        Taskinformation t=taskDao.selectTaskByUId(uid);
        log.info("TaskServiceImp"+"查看任务={}", t);
        if(t!=null)
        {
            return t;
        }
        return null;
    }

    @Override
    public List<Taskinformation> selectTaskAllByUId(int uid) {
        if(uid==0)
        {
            return null;
        }
        List<Taskinformation> t=taskDao.selectTaskAllByUId(uid);
        log.info("TaskServiceImp"+"查看发布任务={}", t);
        if(t!=null)
        {
            return t;
        }
        return null;
    }

    @Override
    public Task selectTaskByUid(int uid) {
        if(uid==0)
        {
            return null;
        }
        Task t=taskDao.selectTaskByUid(uid);
        log.info("TaskServiceImp"+"查看任务={}", t);
        if(t!=null)
        {
            return t;
        }
        return null;
    }

    @Override
    public Task selectTaskBytmid(int tmid) {
        if(tmid==0)
        {
            return null;
        }
        Task t=taskDao.selectTaskBytmid(tmid);
        log.info("TaskServiceImp"+"查看任务={}", t);
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
        log.info("TaskServiceImp"+"删除任务={}", i);
        return i>0?true:false;

    }
}
