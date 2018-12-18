package com.Service.impl;

import com.Dao.FlowDao;
import com.Entity.Flow;
import com.Service.FlowService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 20:54 2018/12/18
 */
@Service
@Transactional
public class FlowServiceImp implements FlowService{

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private FlowDao flowDao;

    @Override
    public boolean insert(Flow f) {

        if(f==null)
        {
            return false;
        }
        int i=flowDao.insert(f);
        log.info(" FlowServiceImp"+"插入流水单={}", i);
        return i>0?true:false;
    }
}
