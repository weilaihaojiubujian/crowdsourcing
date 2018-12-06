package com.Service;

import com.Entity.BankAccount;

import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 11:38 2018/12/6
 */
public interface BankAccountService {

    /**
     * 插入银行账户
     * @param bankAccount
     * @return
     */
    boolean insertBankAccount(BankAccount bankAccount);


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
    boolean deleteBankAccount(int id);
}
