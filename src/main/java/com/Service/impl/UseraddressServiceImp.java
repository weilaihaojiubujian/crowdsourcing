package com.Service.impl;

import com.Dao.UseraddressDao;
import com.Entity.Useraddress;
import com.Service.UseraddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 19:51 2018/11/17
 */
@Service
@Transactional
public class UseraddressServiceImp implements UseraddressService {

    @Autowired
    private UseraddressDao useraddressDao;

    @Override
    public boolean UseraddressRegistered(Useraddress useraddress) {
        if(useraddress==null) return false;
        int i=useraddressDao.insertUseraddress(useraddress);
        System.out.println(i);
        return i>0?true:false;
    }

    @Override
    public List<Useraddress> selectbyposition(int uid, double distance) {
        List<Useraddress> useraddress=useraddressDao.selectByPos(uid,distance);
        if(useraddress!=null )
        {
            return  useraddress;
        }
        return null;
    }
}
