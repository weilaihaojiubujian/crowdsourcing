package com.Controller;

import com.Dto.Person;
import com.Entity.BankAccount;
import com.Entity.User;
import com.Service.BankAccountService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 11:37 2018/12/6
 */
@Controller
@RequestMapping("/bankaccount")
public class BankaccountController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    BankAccountService bankAccountService;

    @RequestMapping(value = "/bankaccount1",method = RequestMethod.GET)
    public String bankaccount1(){
        return "bankaccount";

    }

    @RequestMapping(value = "/bankaccount",method = RequestMethod.GET)
    public ModelAndView bankaccount(int pageNum,HttpSession session){

        ModelAndView m= new ModelAndView();
        User user= (User) session.getAttribute("user");
        int uid=user.getId();
        PageHelper.startPage(pageNum, 10);
        List<BankAccount> b=bankAccountService.selectByUId(uid);
        PageInfo<BankAccount> bankAccount=new PageInfo<BankAccount>(b);

        log.info("BankaccountController"+"银行卡信息={}", b);
        m.addObject("bankAccounts", bankAccount);

        m.setViewName("forward:/bankaccount/bankaccount1");

        return m;


    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public  ModelAndView deleteuser(@PathVariable("id") int id){

        ModelAndView m= new ModelAndView();
        boolean i=bankAccountService.deleteBankAccount(id);

        log.info("BankaccountController"+"删除银行卡={}", i);


        if(i==true)
        {

            m.addObject("prompt", "删除银行卡成功");
            m.setViewName("forward:/bankaccount/bankaccount?pageNum=1");
        }
        else
        {

            m.addObject("prompt", "删除银行卡失败");
            m.setViewName("forward:/bankaccount/bankaccount?pageNum=1");
        }

        return m;
    }


    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ModelAndView addbankaccount(HttpServletRequest request, HttpSession session)throws Exception{

        ModelAndView m= new ModelAndView();
        User user= (User) session.getAttribute("user");
        int uid=user.getId();

        String account= (String) request.getParameter("account");
        System.out.println("银行账号"+account);

        BankAccount b=new BankAccount();
        b.setUid(uid);
        b.setAccount(account);

        boolean i=bankAccountService.insertBankAccount(b);

        log.info("BankaccountController"+"银行卡信息={}", i);


        m.setViewName("redirect:/bankaccount/bankaccount?pageNum=1");

        return m;


    }

}
