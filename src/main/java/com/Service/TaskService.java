package com.Service;

import com.Dto.Taskinformation;
import com.Entity.Task;
import org.apache.ibatis.annotations.Param;

import java.sql.Timestamp;
import java.util.List;

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
     * @param uid
     * @param completetime
     * @return
     */
    boolean insertTaskcompletetime(int uid,Timestamp completetime);



    /**
     * 插入发布者对任务完成的评价
     * @param id
     * @param evaluation
     * @return
     */
    boolean  insertevaluation(@Param("id")int id, @Param("evaluation")double evaluation);


    /**
     * 查看任务
     * @param id
     * @return
     */
    Task selectTask(int id);


    /**
     * 查看任务信息
     * @param uid
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
     * 查看任务
     * @param tmid
     * @return
     */
    Task selectTaskBytmid(int tmid);



    /**
     *平均用户评价
     * @param uid
     * @return
     */
    Double selectevaluationByUid(int uid);
    /**
     * 用户删除接受的任务
     * @param id
     * @return
     */
    boolean deleteTask(int id);
}
