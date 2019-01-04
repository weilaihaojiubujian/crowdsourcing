package com.Dao;

import com.Dto.TransferandFlow;
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

    /**
     * 查看转账记录
     */
    Transfer selectByid(String id);

    int updateState(String  id);

    /**
     *
     * @param uid_one
     * @return
     */
    List<TransferandFlow> selectbyOne(int uid_one);

    List<TransferandFlow> selectOne(int uid_one);
}
