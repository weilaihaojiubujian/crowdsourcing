package com.Controller;

import com.Dto.Business;
import com.Dto.Person;
import com.Dto.TransferandFlow;
import com.Entity.Transfer;
import com.Entity.User;
import com.Service.TransferService;
import com.Service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.org.n3r.idworker.Sid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
 * @Date: Create in 19:25 2018/12/9
 */
@Controller
@RequestMapping("/transfer")
public class TransferController {


    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    TransferService transferService;

    @Autowired
    Sid sid;

    @Autowired
    UserService userService;

    @RequestMapping(value = "/transfer",method = RequestMethod.GET)
    public String transfer(){
        return "transfer";

    }


    @RequestMapping(value = "/recharge1",method = RequestMethod.GET)
    public String recharge1(){
        return "recharge";

    }



    @RequestMapping(value = "/withdrawal1",method = RequestMethod.GET)
    public String withdrawal1(){
        return "withdrawal";

    }


    @RequestMapping(value = "/view",method = RequestMethod.GET)
    public ModelAndView audituser(int pageNum,HttpSession session){

        ModelAndView m= new ModelAndView();
        User user= (User) session.getAttribute("user");
        int uid=user.getId();
        PageHelper.startPage(pageNum, 10);
        List<TransferandFlow> p=transferService.selectbyOne(uid);
        PageInfo<TransferandFlow> penson=new PageInfo<TransferandFlow>(p);
        log.info("TransferController"+"转账信息={}", p);





        m.addObject("transfers", penson);

        m.setViewName("forward:/transfer/transfer");

        return m;
    }

    @RequestMapping(value = "/recharge",method = RequestMethod.POST)
    public ModelAndView recharge(HttpServletRequest request, HttpSession session){

        ModelAndView m= new ModelAndView();
        User user= (User) session.getAttribute("user");
        int uid=user.getId();
        double price= Double.parseDouble(request.getParameter("price"));
        Transfer transfer=new Transfer();
        String id = sid.nextShort();
        transfer.setUid_one(uid);
        transfer.setUid_two(uid);
        transfer.setPrice(price);
        transfer.setId(id);
        boolean i=transferService.insertTransfer(transfer);
        log.info("TransferController"+"新建转账信息={}", i);






        session.setAttribute("transfer",transfer);
        m.setViewName("redirect:/alipay/goPay1");

        return m;
    }



    @RequestMapping(value = "/withdrawal",method = RequestMethod.POST)
    public ModelAndView withdrawal(HttpServletRequest request, HttpSession session){

        ModelAndView m= new ModelAndView();
        User user= (User) session.getAttribute("user");
        int uid=user.getId();
        double price= Double.parseDouble(request.getParameter("price"));
        Transfer transfer=new Transfer();
        String id = sid.nextShort();
        transfer.setUid_one(uid);
        transfer.setUid_two(uid);
        transfer.setPrice(price);
        transfer.setId(id);
        boolean i=transferService.insertTransfer(transfer);
        log.info("TransferController"+"新建转账信息={}", i);

        User u= (User) session.getAttribute("user");
        if(price<=u.getMoney()) {
            if (u.getSpecies().equals("person")) {
                Person p = new Person();
                p.setId(u.getId());
                p.setMoney(u.getMoney() - price);
                boolean y = userService.updateUser(p);
                if (y == true) {

                    boolean j = transferService.updateState(id);
                    m.addObject("prompt", "支付成功");

                } else {

                    m.addObject("prompt", "支付失败");
                    //接受任务失败
                }

            } else {
                Business b = new Business();
                b.setId(u.getId());
                b.setMoney(u.getMoney() - price);
                boolean y = userService.updateBusiness(b);
                if (y == true) {
                    boolean j = transferService.updateState(id);
                    m.addObject("prompt", "支付成功");

                } else {

                    m.addObject("prompt", "支付失败");
                    //接受任务失败
                }



            }
            session.setAttribute("transfer", transfer);
            m.setViewName("forward:/user/login4");
        }
        else
            {
                m.addObject("prompt", "余额不足，请充值");
                session.setAttribute("transfer", transfer);
                m.setViewName("forward:/user/login4");
            }






        return m;
    }
}
