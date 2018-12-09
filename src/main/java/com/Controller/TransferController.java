package com.Controller;

import com.Dto.Person;
import com.Entity.Transfer;
import com.Entity.User;
import com.Service.TransferService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 19:25 2018/12/9
 */
@Controller
@RequestMapping("/transfer")
public class TransferController {


    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    TransferService transferService;


    @RequestMapping(value = "/transfer",method = RequestMethod.GET)
    public String transfer(){
        return "transfer";

    }

    @RequestMapping(value = "/view",method = RequestMethod.GET)
    public ModelAndView audituser(int pageNum,HttpSession session){

        ModelAndView m= new ModelAndView();
        User user= (User) session.getAttribute("user");
        int uid=user.getId();
        PageHelper.startPage(pageNum, 10);
        List<Transfer> p=transferService.selectbyUidOne(uid);
        PageInfo<Transfer> penson=new PageInfo<Transfer>(p);
        log.info("TransferController"+"转账信息={}", p);





        m.addObject("transfers", penson);

        m.setViewName("forward:/transfer/transfer");

        return m;
    }


}
