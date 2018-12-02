package com.Controller;

import com.Entity.User;
import com.Entity.Useraddress;
import com.Service.UserService;
import com.Service.UseraddressService;
import com.Util.GeoHash;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 14:23 2018/12/1
 */
@Controller
@RequestMapping("/address")
public class UseraddressController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UseraddressService useraddressService;


    @Autowired
    UserService userService;

    @RequestMapping(value = "/login1",method = RequestMethod.GET)
    public String login1(){
        return "client";

    }

    @ResponseBody
    @RequestMapping(value = "/position",method = RequestMethod.POST)
    public String positioning(HttpServletRequest request, HttpSession session)throws Exception{
        User user= (User) session.getAttribute("user");
        int uid=user.getId();
        Double locationX= Double.valueOf(request.getParameter("lng"));
        //纬度
        Double locationY=Double.valueOf(request.getParameter("lat"));
        Useraddress u=new Useraddress();
        u.setGeohash(new GeoHash().encode(locationX,locationY));
        u.setLocationX(locationX);
        u.setLocationY(locationY);
        u.setUid(uid);



        Timestamp createtime=new Timestamp(new Date().getTime());
        u.setCreatetime(createtime);
        System.out.println("用户地址:"+u);
        Useraddress q=useraddressService.selectById(uid);
        if(q!=null)
        {

            boolean i=useraddressService.updateUseraddress(u);
        }
        else {
            boolean i=useraddressService.UseraddressRegistered(u);
        }




        return "redirect:/address/login1";
    }


}
