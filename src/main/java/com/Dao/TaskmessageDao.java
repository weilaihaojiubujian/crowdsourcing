package com.Dao;

import com.Entity.Taskmessage;
import com.Entity.Useraddress;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 15:57 2018/11/8
 */
public interface TaskmessageDao {


    /**
     * 插入任务信息
     * @param taskmessage
     * @return
     */
    int insertTaskmessage(Taskmessage taskmessage);


    /**
     * 更新任务状态
     * @param id
     * @param state
     * @return
     */
    int updateTaskmessagestate(@Param("id")int id, @Param("state")int state);


    /**
     * 查看任务信息
     * @param id
     * @return
     */
    Taskmessage selectTaskmessage(int id);



    /**
     * 删除任务
     * @param id
     * @return
     */
    int deleteTaskmessage(int id);
}
