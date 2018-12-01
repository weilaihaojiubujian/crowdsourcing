package com.Controller;

import com.Entity.Pricingmodel;
import com.Entity.Taskmessage;
import com.Entity.Tasktype;
import com.Entity.User;
import com.Service.PricingmodelService;
import com.Service.TaskmessageService;
import com.Service.TasktypeService;
import com.Util.GeoHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
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

    @Autowired
    TaskmessageService taskmessageService;

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
        m.setViewName("forward:/task/release1");

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
        String name= request.getParameter("name");
        String message = request.getParameter("message");

        String str= request.getParameter("startingaddress");
        List<String> result = Arrays.asList(str.split(","));
        String startingaddress=result.get(2);
        Double startinglocationX= Double.valueOf(result.get(0));
                //起始纬度
        Double startinglocationY=Double.valueOf(result.get(1));

        String str1 = request.getParameter("purposeaddress");
        List<String> resultv = Arrays.asList(str1.split(","));
        String purposeaddress =resultv.get(2);

        Double purposelocationX= Double.valueOf(resultv.get(0));
        //目的纬度
        Double purposelocationY=Double.valueOf(resultv.get(1));

        double weight = Double.parseDouble(request.getParameter("weight"));

        Taskmessage t=new Taskmessage();
        t.setWeight(weight);
        t.setStartingaddress(startingaddress);
        t.setPurposeaddress(purposeaddress);
        t.setMessage(message);
        t.setName(name);
        t.setUid(uid);
        t.setPmid(pmid);
        t.setTtid(ttid);
        t.setStartinggeohash(new GeoHash().encode(startinglocationX,startinglocationY));
        t.setPurposegeohash(new GeoHash().encode(purposelocationX,purposelocationY));
        t.setStartinglocationX(startinglocationX);
        t.setStartinglocationY(startinglocationY);
        t.setPurposelocationX(purposelocationX);
        t.setPurposelocationY(purposelocationY);
        System.out.println("任务信息"+t);

        boolean i=taskmessageService.TaskmessageRelease(t);


        return "redirect:/user/login1";
    }
}
