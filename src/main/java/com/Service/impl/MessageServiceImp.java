package com.Service.impl;

import com.Dao.MessageDao;
import com.Dto.Taskinformation;
import com.Entity.Message;
import com.Service.MessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 20:10 2018/12/1
 */
@Service
@Transactional
public class MessageServiceImp implements MessageService {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MessageDao messageDao;

    @Override
    public boolean insertMessage(Message message) {

        if(message==null) return false;
        int i=messageDao.insertMessage(message);
        System.out.println(i);
        log.info("MessageServiceImp"+"发送用户信息={}", i);
        return i>0?true:false;

    }

    @Override
    public List<Taskinformation> selectMessageByUid(int uid) {
        if(uid==0) return null;
        List<Taskinformation> t=messageDao.selectMessageByUid(uid);
        log.info("MessageServiceImp"+"查看信息={}", t);
        if(t!=null)
        {
            return t;
        }
        else {
            return null;
        }



    }

    @Override
    public Message selectMessage(int id) {
        if(id==0) return null;
        Message m=messageDao.selectMessage(id);
        log.info("MessageServiceImp"+"信息={}", m);
        if(m!=null)
        {
            return m;
        }
        else {
            return null;
        }
    }

    @Override
    public boolean updateMessageState(int id) {
        if(id==0) return false;
        int i=messageDao.updateMessageState(id);
        System.out.println(i);
        log.info("MessageServiceImp"+"更新信息状态={}", i);
        return i>0?true:false;
    }

    @Override
    public boolean deleteMessage(int id) {
        if(id==0) return false;
        int i=messageDao.deleteMessage(id);
        System.out.println(i);
        log.info("MessageServiceImp"+"删除信息={}", i);
        return i>0?true:false;
    }
}
