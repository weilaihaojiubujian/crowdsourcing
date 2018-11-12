package com.Service;

import com.Entity.Task;

import java.sql.Timestamp;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 21:29 2018/11/12
 */
public interface TaskService {

    /**
     * 用户接受任务
     * @param task
     * @return
     */
    boolean insertTask(Task task);


    /**
     * 用户完成任务，插入完成时间
     * @param id
     * @param completetime
     * @return
     */
    boolean insertTaskcompletetime(int id,Timestamp completetime);


    /**
     * 查看任务
     * @param id
     * @return
     */
    Task selectTask(int id);


    /**
     * 用户删除接受的任务
     * @param id
     * @return
     */
    boolean deleteTask(int id);
}
