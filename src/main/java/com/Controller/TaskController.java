package com.Controller;

import com.Entity.Pricingmodel;
import com.Entity.Tasktype;
import com.Entity.User;
import com.Service.PricingmodelService;
import com.Service.TasktypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 20:23 2018/11/22
 */
@Controller
@RequestMapping("/task")
public class TaskController {

    @Autowired
    TasktypeService tasktypeService;

    @Autowired
    PricingmodelService pricingmodelService;

    @RequestMapping(value = "/release1",method = RequestMethod.GET)
    public String release1(){
        return "release";

    }


    @RequestMapping(value = "/release",method = RequestMethod.GET)
    public ModelAndView release(){

        ModelAndView m= new ModelAndView();
        List<Tasktype> t=tasktypeService.select();
        System.out.println("TaskController"+"任务种类"+t);

        List<Pricingmodel> p=pricingmodelService.select();
        System.out.println("TaskController"+"计费种类"+p);
        m.addObject("tasktypes", t);
        m.addObject("pricingmodels", p);
        m.setViewName("redirect:/task/release1");

        return m;
    }

    @RequestMapping(value = "/release",method = RequestMethod.POST)
    public String releasetask(HttpServletRequest request, HttpSession session){

        int ttid = Integer.parseInt(request.getParameter("tasktype"));
        System.out.println("任务种类"+ttid);
        int pmid = Integer.parseInt(request.getParameter("pricingmodel"));
        System.out.println("计费种类"+pmid);
        User u= (User) session.getAttribute("user");
        int uid=u.getId();



        return "redirect:/task/release1";
    }
}
