package com.Service;

import com.Entity.Message;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 20:09 2018/12/1
 */
public interface MessageService {

    /**
     * 插入信息
     * @param message
     * @return
     */
    boolean insertMessage(Message message);

    /**
     * 更新信息状态
     * @param id
     * @return
     */
    boolean updateMessageState(int id);


    /**
     * 删除信息
     * @param id
     * @return
     */
    boolean deleteMessage(int id);
}
