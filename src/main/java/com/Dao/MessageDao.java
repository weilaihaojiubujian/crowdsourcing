package com.Dao;

import com.Dto.Taskinformation;
import com.Entity.Message;
import com.Entity.User;

import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 19:56 2018/12/1
 */
public interface MessageDao {


    /**
     * 插入信息
     * @param message
     * @return
     */
    int insertMessage(Message message);

    /**
     * 查看系统发的任务消息
     * @param uid
     * @return
     */
    List<Taskinformation> selectMessageByUid(int uid);


    /**
     * 查看信息
     * @param id
     * @return
     */
    Message selectMessage(int id);

    /**
     * 更新信息状态
     * @param id
     * @return
     */
    int updateMessageState(int id);


    /**
     * 删除信息
     * @param id
     * @return
     */
    int deleteMessage(int id);
}
