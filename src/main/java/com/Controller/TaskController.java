package com.Controller;

import com.Dto.Taskinformation;
import com.Entity.*;
import com.Service.*;
import com.Util.GeoHash;
import com.Util.Money;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.org.n3r.idworker.Sid;
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
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 20:23 2018/11/22
 */
@Controller
@RequestMapping("/task")
public class TaskController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    TasktypeService tasktypeService;

    @Autowired
    PricingmodelService pricingmodelService;

    @Autowired
    TaskmessageService taskmessageService;

    @Autowired
    UseraddressService useraddressService;

    @Autowired
    MessageService messageService;

    @Autowired
    TaskService taskService;

    @Autowired
    TransferService transferService;

    @Autowired
    Sid sid;

    @RequestMapping(value = "/release1",method = RequestMethod.GET)
    public String release1(){
        return "release";

    }
    @RequestMapping(value = "/message1",method = RequestMethod.GET)
    public String message1(){
        return "message";

    }

    @RequestMapping(value = "/already1",method = RequestMethod.GET)
    public String already1(){
        return "already";

    }


    @RequestMapping(value = "/releasetaskbyuser",method = RequestMethod.GET)
    public String  releasetaskbyuser(){
        return "releasetaskbyuser";

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


    @RequestMapping(value = "/distribution/{id}",method = RequestMethod.GET)
    public ModelAndView distributiontask(@PathVariable("id") int id){

        ModelAndView m= new ModelAndView();
        Taskinformation t=taskmessageService.selectTaskmessage(id);
        List<Useraddress> u=useraddressService.selectbyposition(t.getUid(),10000000);
        log.info("TaskController"+"附近的用户地址={}", u);
        for(Useraddress i:u)
        {
            int uid=i.getUid();
            Message q=new Message();
            q.setTmid(id);
            q.setUid(uid);
            Timestamp createtime=new Timestamp(new Date().getTime());
            q.setCreatetime(createtime);
            boolean j=messageService.insertMessage(q);
        }

        m.setViewName("redirect:/administrator/administrator");

        return m;
    }



    @RequestMapping(value = "/message",method = RequestMethod.GET)
    public ModelAndView usermessage(int pageNum,HttpSession session){

        ModelAndView m= new ModelAndView();
        User user= (User) session.getAttribute("user");
        int uid=user.getId();
        List<Taskinformation> t=messageService.selectMessageByUid(uid);
        PageHelper.startPage(pageNum, 10);
        PageInfo<Taskinformation> taskinformation=new PageInfo<Taskinformation>(t);

        m.addObject("taskinformations", taskinformation);
        m.setViewName("forward:/task/message1");

        return m;
    }
    @RequestMapping(value = "/accept/{id}",method = RequestMethod.GET)
    public ModelAndView accepttask(@PathVariable("id") int id,HttpSession session){

        ModelAndView m= new ModelAndView();
        User user= (User) session.getAttribute("user");
        int uid=user.getId();
        Task t=taskService.selectTaskBytmid(id);
        Task p=taskService.selectTaskByUid(uid);
        if(t==null && p==null)
        {
            Taskinformation g=taskmessageService.selectTaskmessage(id);

            Task i=new Task();
            if(g.getPmname().equals("按单计费"))
            {
                i.setPrice(20);
            }
            else if (g.getPmname().equals("按公里计费"))
            {
                i.setPrice(Money.calculatebydistance(g.getDistance()));
            }
            else if(g.getPmname().equals("按重量计费"))
            {
                i.setPrice(Money.calculatebyweight(g.getWeight()));
            }
            else {
                i.setPrice(Money.calculatebytime(g.getDistance()));
            }

            i.setTmid(id);
            Timestamp createtime=new Timestamp(new Date().getTime());
            i.setCreatetime(createtime);
            i.setUid(uid);
            boolean j=taskService.insertTask(i);
            if(j==true)
            {

                m.addObject("prompt", "接受任务成功");

            }
            else{

                m.addObject("prompt", "接受任务失败");
                //接受任务失败
            }
        }
        else {

            m.addObject("prompt", "任务已被人接受，无法接受任务");
            //任务已被人接受，无法接受任务
        }
        m.setViewName("forward:/user/login1");
        return m;
    }



    @RequestMapping(value = "/already",method = RequestMethod.GET)
    public ModelAndView alreadytask(HttpSession session){

        ModelAndView m= new ModelAndView();
        User user= (User) session.getAttribute("user");
        int uid=user.getId();
        Taskinformation t=taskService.selectTaskByUId(uid);


        m.addObject("p", t);
        m.setViewName("forward:/task/already1");

        return m;
    }

    @RequestMapping(value = "/complete",method = RequestMethod.GET)
    public ModelAndView completetask(HttpSession session){

        ModelAndView m= new ModelAndView();
        User user= (User) session.getAttribute("user");
        int uid=user.getId();
        Taskinformation t=taskService.selectTaskByUId(uid);
        Timestamp completetimee=new Timestamp(new Date().getTime());
        boolean j=taskService.insertTaskcompletetime(uid,completetimee);
        log.info("TaskController"+"用户完成任务，插入完成时间={}", j);
        Transfer transfer=new Transfer();
        String id = sid.nextShort();
        transfer.setUid_one(t.getUid());
        transfer.setUid_two(uid);
        transfer.setPrice(t.getPrice());
        transfer.setId(id);
        boolean i=transferService.insertTransfer(transfer);


        m.setViewName("redirect:/user/login1");

        return m;
    }

    @RequestMapping(value = "/releasebyuser",method = RequestMethod.GET)
    public ModelAndView releasebyusertask(int pageNum,HttpSession session){

        ModelAndView m= new ModelAndView();
        User user= (User) session.getAttribute("user");
        int uid=user.getId();
        List<Taskinformation> t=taskService.selectTaskAllByUId(uid);
        log.info("TaskController"+"用户查看自己发布的任务={}", t);
        PageHelper.startPage(pageNum, 10);
        PageInfo<Taskinformation> taskinformation=new PageInfo<Taskinformation>(t);

        m.addObject("taskinformations", taskinformation);
        m.setViewName("forward:/task/releasetaskbyuser");

        return m;
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public ModelAndView deletetask(@PathVariable("id") int id){
//取消任务
        ModelAndView m= new ModelAndView();

        boolean j=taskmessageService.deleteTaskmessage(id);



        m.setViewName("redirect:/task/releasebyuser");

        return m;
    }

    @RequestMapping(value = "/evaluation/{id}",method = RequestMethod.GET)
    public ModelAndView evaluationtask(@PathVariable("id") int id,HttpServletRequest request){
//取消任务
        ModelAndView m= new ModelAndView();

        double evaluation= Double.parseDouble(request.getParameter("evaluation"));

        boolean j=taskService.insertevaluation(id,evaluation);
        if(j==true)
        {
            m.addObject("prompt", "评价成功");
        }
        else {
            m.addObject("prompt", "评价失败");
        }



        m.setViewName("forward:/task/releasebyuser?pageNum=1");

        return m;
    }

}
