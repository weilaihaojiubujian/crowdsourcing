package com.Service;

import com.Entity.Transfer;

import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 19:26 2018/12/9
 */
public interface TransferService {

    /**
     * 插入转账记录
     * @param transfer
     * @return
     */
    boolean  insertTransfer(Transfer transfer);

    /**
     * 列出所有转账记录
     * @param uid_one
     * @return
     */
    List<Transfer> selectbyUidOne(int uid_one);

    /**
     * 查看转账记录
     */
    Transfer selectByid(String  id);


    boolean updateState(String  id);
}
