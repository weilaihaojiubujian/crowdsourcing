package com.Dao;

import com.Entity.BankAccount;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 13:38 2018/11/11
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class BankAccountDaoTest {


    @Resource
    private BankAccountDao bankAccountDao;

    @Test
    public void insertBankAccount()
    {
        BankAccount b=new BankAccount();
        String account="330645";
        int uid=2;
        b.setAccount(account);
        b.setUid(uid);

        int i=bankAccountDao.insertBankAccount(b);
        System.out.println(i);

    }

    @Test
    public void selectByUId()
    {

        int uid=2;
        List<BankAccount> list=bankAccountDao.selectByUId(uid);
        for (BankAccount b:list)
        {
            System.out.println("银行账号:"+b);
        }
    }

    @Test
    public void deleteBankAccount()
    {

        int id=3;
        int i=bankAccountDao.deleteBankAccount(id);
        System.out.println(i);
    }

}


