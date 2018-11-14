package com.Controller;

import com.Entity.User;
import com.Service.LoginService;
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

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(HttpServletRequest request, Model model, HttpSession session){
        User u=(User) session.getAttribute("user");
        if(u!=null) return "WEB-INF/jsp/client.jsp";
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        if(password==null||password.equals("")|| username==null||username.equals(""))
            return "WEB-INF/jsp/erro.jsp";//调试

        User user=loginService.userLogin(username,password);
        model.addAttribute("user",user);
        return "WEB-INF/jsp/client.jsp";
    }
}
