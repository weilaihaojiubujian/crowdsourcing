package com.Dao;

import com.Entity.BankAccount;

import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 15:03 2018/11/8
 */
public interface BankAccountDao {


    /**
     * 插入银行账户
     * @param bankAccount
     * @return
     */
    int insertBankAccount(BankAccount bankAccount);


    /**
     *根据用户id查询银行账户
     * @param uid
     * @return
     */
    List<BankAccount> selectByUId(int uid);


    /**
     * 根据id删除用户账号
     * @param id
     * @return
     */
    int deleteBankAccount(int id);


}
