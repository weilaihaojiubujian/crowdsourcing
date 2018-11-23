package com.Controller;

import com.Dto.Merchants;
import com.Dto.People;
import com.Entity.User;
import com.Service.AuditService;
import com.Service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 18:45 2018/11/23
 */
@Controller
@RequestMapping("/administrator")
public class AdministratorController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    AuditService auditService;

    @RequestMapping(value = "/audit",method = RequestMethod.GET)
    public  ModelAndView audituser(){

        ModelAndView m= new ModelAndView();
        List<People> p=auditService.selectpeople();
        log.info("AdministratorController"+"用户个人信息={}", p);

        List<Merchants> me=auditService.selectmerchants();
        log.info("AdministratorController"+"商家个人信息={}", me);


        m.addObject("peoples", p);
        m.addObject("merchantss", me);
        m.setViewName("audituser");

        return m;
    }

    @RequestMapping(value = "/audit/{id}",method = RequestMethod.GET)
    public  ModelAndView auditPeople(@PathVariable("id") int id){

        ModelAndView m= new ModelAndView();
       boolean i=auditService.updateUserState(id);

        log.info("AdministratorController"+"审核用户通过={}", i);


        if(i==true)
        {
            m.setViewName("administrator");
        }
        else
        {

            m.setViewName("redirect:/administrator/audit");
        }

        return m;
    }
}
