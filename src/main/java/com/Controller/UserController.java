package com.Controller;

import com.Entity.Administrator;
import com.Entity.User;
import com.Service.LoginService;
import com.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 19:36 2018/11/14
 */
@Controller
@RequestMapping("/user")
@SessionAttributes("user")
public class UserController {

    @Autowired
    LoginService loginService;


    @Autowired
    UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(HttpServletRequest request, Model model, HttpSession session){
        User u=(User) session.getAttribute("user");
        if(u!=null) return "client";
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

         boolean i=userService.userRegistered(u);
         if(i==true)
         {
             return "login";
         }
         else
         {
             return "regist";
         }



    }

}
