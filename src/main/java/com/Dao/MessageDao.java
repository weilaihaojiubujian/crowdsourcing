package com.Dao;

import com.Entity.Message;
import com.Entity.User;

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
