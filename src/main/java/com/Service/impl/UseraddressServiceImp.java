package com.Service.impl;

import com.Dao.UseraddressDao;
import com.Entity.Useraddress;
import com.Service.UseraddressService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UseraddressDao useraddressDao;

    @Override
    public boolean UseraddressRegistered(Useraddress useraddress) {
        if(useraddress==null) return false;
        int i=useraddressDao.insertUseraddress(useraddress);
        System.out.println(i);
        log.info("UseraddressServiceImp"+"用户地址定位={}", i);
        return i>0?true:false;
    }

    @Override
    public Useraddress selectById(int uid) {
        if (uid==0)return null;
        Useraddress u=useraddressDao.selectById(uid);
        log.info("UseraddressServiceImp"+"查询用户定位={}", u);
        if (u!=null)
        {
            return u;
        }
        else {
            return null;
        }

    }

    @Override
    public List<Useraddress> selectByUid(int uid) {

        if (uid==0)return null;
        List<Useraddress> useraddress=useraddressDao.selectByUid(uid);
        log.info("UseraddressServiceImp"+"查询用户所有定位={}", useraddress);
        if(useraddress!=null )
        {
            return  useraddress;
        }
        return null;
    }

    @Override
    public List<Useraddress> selectbyposition(int uid, double distance) {
        List<Useraddress> useraddress=useraddressDao.selectByPos(uid,distance);
        log.info("UseraddressServiceImp"+"查询附近用户={}", useraddress);
        if(useraddress!=null )
        {
            return  useraddress;
        }
        return null;
    }

    @Override
    public boolean updateUseraddress(Useraddress u) {
        if(u==null) return false;
        int i=useraddressDao.updateUseraddress(u);
        System.out.println(i);
        log.info("UseraddressServiceImp"+"更新用户定位={}", i);
        return i>0?true:false;
    }

    @Override
    public boolean deleteAddress(int id) {
        if(id==0) return false;
        int i=useraddressDao.deleteAddress(id);
        System.out.println(i);
        log.info("UseraddressServiceImp"+"用户地址定位={}", i);
        return i>0?true:false;
    }
}
