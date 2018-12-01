package com.Controller;

import com.Dto.Business;
import com.Dto.Person;
import com.Dto.Taskinformation;
import com.Service.AuditService;
import com.Service.TaskmessageService;
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


    @Autowired
    UserService userService;

    @Autowired
    TaskmessageService taskmessageService;


    @RequestMapping(value = "/audituser",method = RequestMethod.GET)
    public String audituser1(){
        return "audituser";

    }

    @RequestMapping(value = "/audittask1",method = RequestMethod.GET)
    public String audittask1(){
        return "audittask";

    }

    @RequestMapping(value = "/administrator",method = RequestMethod.GET)
    public String administrator(){
        return "administrator";

    }

    @RequestMapping(value = "/deleteuser",method = RequestMethod.GET)
    public String deleteuser1(){
        return "deleteuser";

    }

    @RequestMapping(value = "/audit",method = RequestMethod.GET)
    public  ModelAndView audituser(){

        ModelAndView m= new ModelAndView();
        List<Person> p=auditService.selectpeople();
        log.info("AdministratorController"+"用户个人信息={}", p);

        List<Business> me=auditService.selectmerchants();
        log.info("AdministratorController"+"商家个人信息={}", me);


        m.addObject("persons", p);
        m.addObject("businesss", me);
        m.setViewName("forward:/administrator/audituser");

        return m;
    }


    @RequestMapping(value = "/audittask",method = RequestMethod.GET)
    public  ModelAndView audittask(){

        ModelAndView m= new ModelAndView();
        List<Taskinformation> t=auditService.selectTaskinformation();
        log.info("AdministratorController"+"任务信息={}", t);




        m.addObject("taskinformations", t);

        m.setViewName("forward:/administrator/audittask1");

        return m;
    }

    @RequestMapping(value = "/audit/{id}",method = RequestMethod.GET)
    public  ModelAndView auditPeople(@PathVariable("id") int id){

        ModelAndView m= new ModelAndView();
       boolean i=auditService.updateUserState(id);

        log.info("AdministratorController"+"审核用户通过={}", i);


        if(i==true)
        {
            m.setViewName("redirect:/administrator/administrator");
        }
        else
        {

            m.setViewName("redirect:/administrator/audit");
        }

        return m;
    }

    @RequestMapping(value = "/audit1/{id}",method = RequestMethod.GET)
    public  ModelAndView audittask(@PathVariable("id") int id){

        ModelAndView m= new ModelAndView();
        boolean i=taskmessageService.updateTaskmessagestate(id);

        log.info("AdministratorController"+"审核任务通过={}", i);


        if(i==true)
        {
            m.setViewName("redirect:/administrator/administrator");
        }
        else
        {

            m.setViewName("redirect:/administrator/audittask");
        }

        return m;
    }


    @RequestMapping(value = "/auditbyevaluation",method = RequestMethod.GET)
    public  ModelAndView audituserbyevaluation(){

        ModelAndView m= new ModelAndView();
        List<Person> p=auditService.selectPerson();
        log.info("AdministratorController"+"用户个人信息={}", p);




        m.addObject("persons", p);
        m.setViewName("forward:/administrator/deleteuser");

        return m;
    }


    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public  ModelAndView deleteuser(@PathVariable("id") int id){

        ModelAndView m= new ModelAndView();
        boolean i=userService.deleteUser(id);

        log.info("AdministratorController"+"删除用户={}", i);


        if(i==true)
        {
            m.setViewName("redirect:/administrator/administrator");
        }
        else
        {

            m.setViewName("redirect:/administrator/auditbyevaluation");
        }

        return m;
    }

}
