package com.Dao;

import com.Dto.Taskinformation;
import com.Entity.Task;
import org.apache.ibatis.annotations.Param;

import java.sql.Timestamp;
import java.util.List;

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
    int insertTaskcompletetime(@Param("uid")int uid, @Param("completetime")Timestamp completetime);


    /**
     * 插入发布者对任务完成的评价
     * @param id
     * @param evaluation
     * @return
     */
    int insertevaluation(@Param("id")int id,@Param("evaluation")double evaluation);

    /**
     * 查看任务
     * @param id
     * @return
     */
    Task selectTask(int id);


    /**
     * 查看任务信息
     * @param id
     * @return
     */
    Taskinformation selectTaskByUId(int uid);


    /**
     *
     * @param uid
     * @return
     */
    List<Taskinformation> selectTaskAllByUId(int uid);

    /**
     * 查看任务
     * @param uid
     * @return
     */
    Task selectTaskByUid(int uid);


    /**
     *
     * @param uid
     * @return
     */
    Double selectevaluationByUid(int uid);


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
