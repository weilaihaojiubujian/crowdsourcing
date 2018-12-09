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

    @Autowired
    TaskService taskService;


    @RequestMapping(value = "/main",method = RequestMethod.GET)
    public String  main(){
        return "mainPage";

    }


    @RequestMapping(value = "/login3",method = RequestMethod.GET)
    public String login3(){
        return "login";

    }

    @RequestMapping(value = "/login1",method = RequestMethod.GET)
    public String login1(){
        return "client";

    }

    @RequestMapping(value = "/login2",method = RequestMethod.GET)
    public String login2(){
        return "administrator";

    }
    @RequestMapping(value = "/error",method = RequestMethod.GET)
    public String error(){
        return "error";

    }

    @RequestMapping(value = "/registpersoninformation1",method = RequestMethod.GET)
    public String registpersoninformation(){
        return "registpersoninformation";

    }

    @RequestMapping(value = "/registbusinessinformation1",method = RequestMethod.GET)
    public String registbusinessinformation(){
        return "registbusinessinformation";

    }

    @RequestMapping(value = "/personinformation",method = RequestMethod.GET)
    public String personinformation(){
        return "personinformation";

    }

    @RequestMapping(value = "/businessinformation",method = RequestMethod.GET)
    public String businessinformation(){
        return "businessinformation";

    }


    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(HttpServletRequest request, Model model, HttpSession session){


            String username=request.getParameter("username");
            String password=request.getParameter("password");
            if(password==null||password.equals("")|| username==null||username.equals(""))
              return "redirect:/user/error";//调试




            System.out.println("用户");
            User user=loginService.userLogin(username,password);
            session.setAttribute("user",user);

            if(user!=null)
            {
                if(user.getSpecies().equals("person"))
                {
                    Double d=taskService.selectevaluationByUid(user.getId());
                    Personinformation p=new Personinformation();
                    p.setUid(user.getId());
                    p.setEvaluation(d);
                    boolean l=personinformationService.updatePersoninformation(p);

                }

                return "redirect:/user/login1";
            }
            else
            {
                return "redirect:/user/error";//调试
            }





    }

    @RequestMapping(value = "/administratorlogin",method = RequestMethod.POST)
    public String administratorlogin(HttpServletRequest request, Model model, HttpSession session){


            String username=request.getParameter("username");
            String password=request.getParameter("password");
            if(password==null||password.equals("")|| username==null||username.equals(""))
               return "redirect:/user/error";//调试




            System.out.println("管理员");
            Administrator user=loginService.administratorLogin(username,password);

            session.setAttribute("administrator",user);

            if(user!=null)
            {
                return "redirect:/user/login2";
            }
            else
            {
                return "redirect:/user/error";//调试
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
                    return "redirect:/user/registpersoninformation1";
                }
                else
                {
                    return "redirect:/user/registbusinessinformation1";
                }

            }
            else
            {
                return "redirect:/user/regist";
            }
        }
        else
        {
            return "redirect:/user/login3";
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
                return "redirect:/user/registpersoninformation1";
            }
            else
            {
                Person q=userinformationService.selectpeopleinformation(uid);
                model.addAttribute("person",q);
                return "forward:/user/personinformation";
            }

        }
        else {

            Businessinformation b=businessinformationService.selectBusinessinformation(uid);
            if (b==null)
            {
                return "redirect:/user/registbusinessinformation1";
            }
            else {
                Business w=userinformationService.selectbusinessinformation(uid);
                model.addAttribute("business",w);
                return "forward:/user/businessinformation";
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
            return "redirect:/user/login3";
        }
        else
        {
            return "redirect:/user/registpersoninformation1";
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
            return "redirect:/user/login3";
        }
        else
        {
            return "redirect:/user/registbusinessinformation1";
        }



    }


    @RequestMapping(value = "/personinformation1",method = RequestMethod.POST)
    public String personinformation1(HttpServletRequest request, HttpSession session) throws ParseException {
        User user= (User) session.getAttribute("user");
        int uid=user.getId();
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        String phonenumber= request.getParameter("phonenumber");

        String name = request.getParameter("name");
        String sex = request.getParameter("sex");

        String city= request.getParameter("city");
        String idcard= request.getParameter("idcard");


        Personinformation p=new Personinformation();
        p.setBirthday(request.getParameter("birthday"));

        Person q=new Person();
        q.setBirthday(p.getBirthday());
        q.setCity(city);
        q.setId(uid);
        q.setUsername(username);
        q.setPassword(password);
        q.setPhonenumber(phonenumber);
        q.setName(name);
        q.setSex(sex);
        q.setIdcard(idcard);
        log.info("UserController"+"用户更新个人信息={}", q);
        boolean i=userService.updateUser(q);


        return "redirect:/user/information";


    }

    @RequestMapping(value = "/businessinformation1",method = RequestMethod.POST)
    public String businessinformation1(HttpServletRequest request, HttpSession session){
        User user= (User) session.getAttribute("user");
        int uid=user.getId();
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        String phonenumber= request.getParameter("phonenumber");

        String name = request.getParameter("name");
        String address = request.getParameter("address");

        String headname= request.getParameter("headname");
        String headidcard= request.getParameter("headidcard");

        Business b=new Business();
        b.setAddress(address);
        b.setHeadidcard(headidcard);
        b.setHeadname(headname);
        b.setName(name);
        b.setUsername(username);
        b.setPassword(password);
        b.setPhonenumber(phonenumber);
        b.setId(uid);

        log.info("UserController"+"商家用户更新个人信息={}", b);
        boolean i=userService.updateBusiness(b);


        return "redirect:/user/information";


    }


}
