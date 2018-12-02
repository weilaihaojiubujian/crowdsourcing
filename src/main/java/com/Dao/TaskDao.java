package com.Dao;

import com.Entity.Task;
import org.apache.ibatis.annotations.Param;

import java.sql.Timestamp;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 16:04 2018/11/8
 */
public interface TaskDao {

    /**
     * 插入任务
     * @param task
     * @return
     */
    int insertTask(Task task);


    /**
     * 插入任务完成时间
     * @param id
     * @param completetime
     * @return
     */
    int insertTaskcompletetime(@Param("id")int id, @Param("completetime")Timestamp completetime);


    /**
     * 查看任务
     * @param id
     * @return
     */
    Task selectTask(int id);


    /**
     * 查看任务
     * @param tmid
     * @return
     */
    Task selectTaskBytmid(int tmid);

    /**
     * 删除任务
     * @param id
     * @return
     */
    int deleteTask(int id);
}
