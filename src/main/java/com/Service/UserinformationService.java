package com.Service;

import com.Dto.Business;
import com.Dto.Person;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 20:15 2018/11/24
 */
public interface UserinformationService {


    /**
     * 查询个人用户信息
     * @param id
     * @return
     */
    Person selectpeopleinformation(int id);

    /**
     * 查询商家信息
     * @param id
     * @return
     */
    Business selectbusinessinformation(int id);
}
