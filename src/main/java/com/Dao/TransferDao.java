package com.Dao;

import com.Entity.Transfer;

import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 17:11 2018/12/9
 */
public interface TransferDao {


    /**
     * 插入转账记录
     * @param transfer
     * @return
     */
    int insertTransfer(Transfer transfer);

    /**
     * 列出所有转账记录
     * @param uid_one
     * @return
     */
    List<Transfer> selectbyUidOne(int uid_one);
}
