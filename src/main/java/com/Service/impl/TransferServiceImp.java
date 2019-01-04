package com.Service.impl;

import com.Dao.TransferDao;
import com.Dto.TransferandFlow;
import com.Entity.Transfer;
import com.Entity.Useraddress;
import com.Service.TransferService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 19:27 2018/12/9
 */
@Service
@Transactional
public class TransferServiceImp implements TransferService {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TransferDao transferDao;

    @Override
    public boolean insertTransfer(Transfer transfer) {
        if(transfer==null) return false;
        int i=transferDao.insertTransfer(transfer);
        System.out.println(i);
        log.info("TransferServiceImp"+"插入转账记录={}", i);
        return i>0?true:false;
    }

    @Override
    public List<Transfer> selectbyUidOne(int uid_one) {

        if (uid_one==0)return null;
        List<Transfer> t=transferDao.selectbyUidOne(uid_one);
        log.info("TransferServiceImp"+"列出用户所有转账记录={}", t);
        if(t!=null )
        {
            return  t;
        }
        return null;
    }

    @Override
    public Transfer selectByid(String  id) {
        if (id==null)return null;
        Transfer t=transferDao.selectByid(id);
        log.info("TransferServiceImp"+"转账记录={}", t);
        if(t!=null )
        {
            return  t;
        }
        return null;
    }

    @Override
    public boolean updateState(String  id) {
        if (id==null) return false;
        int i=transferDao.updateState(id);
        System.out.println(i);
        log.info("TransferServiceImp"+"更新转账记录={}", i);
        return i>0?true:false;
    }

    @Override
    public List<TransferandFlow> selectbyOne(int uid_one) {
        if (uid_one==0)return null;
        List<TransferandFlow> t=transferDao.selectbyOne(uid_one);
        log.info("TransferServiceImp"+"列出用户所有转账记录={}", t);
        if(t!=null )
        {
            return  t;
        }
        return null;
    }

    @Override
    public List<TransferandFlow> selectOne(int uid_one) {
        if (uid_one==0)return null;
        List<TransferandFlow> t=transferDao.selectOne(uid_one);
        log.info("TransferServiceImp"+"列出用户未转账记录={}", t);
        if(t!=null )
        {
            return  t;
        }
        return null;
    }
}
