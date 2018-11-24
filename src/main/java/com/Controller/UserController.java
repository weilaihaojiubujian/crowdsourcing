package com.Controller;

import com.Dto.Business;
import com.Dto.Person;
import com.Entity.Administrator;
import com.Entity.Businessinformation;
import com.Entity.Personinformation;
import com.Entity.User;
import com.Service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 19:36 2018/11/14
 */
@Controller
@RequestMapping("/user")
@SessionAttributes("user")
public class UserController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    LoginService loginService;


    @Autowired
    UserService userService;

    @Autowired
    PersoninformationService personinformationService;

    @Autowired
    BusinessinformationService businessinformationService;

    @Autowired
    UserinformationService userinformationService;




    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(HttpServletRequest request, Model model, HttpSession session){

        String use = request.getParameter("use");
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        if(password==null||password.equals("")|| username==null||username.equals(""))
            return "error";//调试



        if (use.equals("用户")) {
            System.out.println("用户");
            User user=loginService.userLogin(username,password);
            session.setAttribute("user",user);
            model.addAttribute("user",user);
            if(user!=null)
            {
                return "client";
            }
            else
            {
                return "error";//调试
            }


        } else {
            System.out.println("管理员");
            Administrator user=loginService.administratorLogin(username,password);
            session.setAttribute("user",user);
            model.addAttribute("user",user);
            if(user!=null)
            {
                return "administrator";
            }
            else
            {
                return "error";//调试
            }


        }
    }

    @RequestMapping(value = "/regist",method = RequestMethod.GET)
    public String regist(){
        return "regist";
    }


    @RequestMapping(value = "/regist",method = RequestMethod.POST)
    public String registuser(HttpServletRequest request, Model model, HttpSession session){
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        String phonenumber= request.getParameter("phonenumber");
        String species= request.getParameter("species");

        User u=new User();

        u.setSpecies(species);
        u.setPassword(password);
        u.setUsername(username);

        u.setPhonenumber(phonenumber);

        User use=userService.selectByUsernamePasswordToId(username,password);
        if(use==null)
        {
            boolean i=userService.userRegistered(u);
            if(i==true)
            {
                User user=userService.selectByUsernamePasswordToId(username,password);
                session.setAttribute("user",user);
                if(species.equals("person"))
                {
                    return "registpersoninformation";
                }
                else
                {
                    return "registbusinessinformation";
                }

            }
            else
            {
                return "regist";
            }
        }
        else
        {
            return "login";
        }






    }

    @RequestMapping(value = "/information",method = RequestMethod.GET)
    public String information(HttpServletRequest request, Model model, HttpSession session){
        User user= (User) session.getAttribute("user");
        String species=user.getSpecies();
        int uid=user.getId();

        if(species.equals("person"))
        {

            Personinformation p=personinformationService.selectPersoninformation(uid);
            if(p==null)
            {
                return "registpersoninformation";
            }
            else
            {
                Person q=userinformationService.selectpeopleinformation(uid);
                model.addAttribute("person",q);
                return "personinformation";
            }

        }
        else {

            Businessinformation b=businessinformationService.selectBusinessinformation(uid);
            if (b==null)
            {
                return "registbusinessinformation";
            }
            else {
                Business w=userinformationService.selectbusinessinformation(uid);
                model.addAttribute("business",w);
                return "businessinformation";
            }


        }




    }


    @RequestMapping(value = "/registpersoninformation",method = RequestMethod.POST)
    public String registpersoninformation(HttpServletRequest request, HttpSession session) throws ParseException {
        User user= (User) session.getAttribute("user");
        int uid=user.getId();
        String name = request.getParameter("name");
        String sex = request.getParameter("sex");

        String city= request.getParameter("city");
        String idcard= request.getParameter("idcard");


        Personinformation p=new Personinformation();
        p.setBirthday(request.getParameter("birthday"));
        p.setName(name);
        p.setSex(sex);
        p.setCity(city);
        p.setIdcard(idcard);
        p.setUid(uid);



        boolean i=personinformationService.PersoninformationRegistered(p);
        if(i==true)
        {
            return "login";
        }
        else
        {
            return "registpersoninformation";
        }



    }

    @RequestMapping(value = "/registbusinessinformation",method = RequestMethod.POST)
    public String registbusinessinformation(HttpServletRequest request, HttpSession session)  {
        User user= (User) session.getAttribute("user");
        int uid=user.getId();
        String name = request.getParameter("name");
        String address = request.getParameter("address");

        String headname= request.getParameter("headname");
        String headidcard= request.getParameter("headidcard");


        Businessinformation b=new Businessinformation();
        b.setHeadidcard(headidcard);
        b.setHeadname(headname);
        b.setName(name);
        b.setAddress(address);
        b.setUid(uid);
        log.info("UserController"+"商家个人信息={}", b);

        boolean i=businessinformationService.BusinessinformationRegistered(b);
        if(i==true)
        {
            return "login";
        }
        else
        {
            return "registbusinessinformation";
        }



    }


}
