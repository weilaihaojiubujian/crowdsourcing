package com.Service.impl;

import com.Dao.BankAccountDao;
import com.Entity.BankAccount;
import com.Service.BankAccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 11:39 2018/12/6
 */
@Service
@Transactional
public class BankAccountServiceImp implements BankAccountService {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BankAccountDao bankAccountDao;

    @Override
    @Cacheable(value="common",key="#bankAccount")
    public boolean insertBankAccount(BankAccount bankAccount) {
        if(bankAccount==null) return false;
        int i=bankAccountDao.insertBankAccount(bankAccount);
        log.info("BankAccountServiceImp"+"添加银行卡={}", i);
        return i>0?true:false;
    }

    @Override
    public List<BankAccount> selectByUId(int uid) {
        if(uid==0) return null;
        List<BankAccount> i=bankAccountDao.selectByUId(uid);
        log.info("BankAccountServiceImp"+"删除银行卡={}", i);
        if(i!=null)
        {
            return i;
        }
        else {
            return null;
        }
    }

    @Override
    public boolean deleteBankAccount(int id) {
        if(id==0) return false;
        int i=bankAccountDao.deleteBankAccount(id);
        log.info("BankAccountServiceImp"+"删除银行卡={}", i);
        return i>0?true:false;
    }
}
