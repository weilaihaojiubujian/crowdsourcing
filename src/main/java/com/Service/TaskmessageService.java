package com.Service;

import com.Dto.Taskinformation;
import com.Entity.Taskmessage;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 21:04 2018/11/12
 */
public interface TaskmessageService {

    /**
     * 发布任务具体信息
     * @param taskmessage
     */
    boolean TaskmessageRelease(Taskmessage taskmessage);

    /**
     * 更新任务的状态
     * 审核未通过为0，通过为1
     * @param id
     * @param state
     */
    boolean updateTaskmessagestate(int id);

    /**
     * 查看具体的任务信息
     * @param id
     * @return
     */
    Taskinformation selectTaskmessage(int id);


    /**
     * 在他人未接受前删除任务
     * @param id
     */
    boolean deleteTaskmessage(int id);


}
