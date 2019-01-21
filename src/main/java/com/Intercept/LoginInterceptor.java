package com.Intercept;

import com.Entity.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 20:11 2019/1/20
 */
//登录认证的拦截器
public class LoginInterceptor implements HandlerInterceptor {

    //执行Handler方法之前执行
    //用于身份认证、身份授权
    //比如身份认证，如果认证通过表示当前用户没有登陆，需要此方法拦截不再向下执行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {

        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        System.out.println("HandlerInterceptor1.....preHandle");

        //获取请求的url
        String url=request.getRequestURI();
        System.out.println(url.indexOf("login"));
        //判断url是否是公开地址(实际使用时将公开地址配置到配置文件中)
        if((url.indexOf("login")>=0 || url.indexOf("administratorlogin")>=0)&& (url.indexOf("login1")<0)){
            //如果要进行登录提交，放行
            return true;
        }

        //判断session
        HttpSession session=request.getSession();
        //从session中取出用户份信息
        User user=(User)session.getAttribute("user");
        System.out.println("HandlerInterceptor1.....preHandle");
        if(user!=null){
            //身份存在，放行
            return true;
        }

        //执行这里表示用户身份需要验证，跳转到登录界面
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);

        //return false表示拦截，不向下执行
        //return true表示放行
        return false;
    }

    //进入Handler方法之后，返回modelAndView之前执行
    //应用场景从modelAndView出发：将公用的模型数据(比如菜单导航)在这里
    //传到视图，也可以在这里统一指定视图
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response,
                           Object handler, ModelAndView modelAndView) throws Exception {

        System.out.println("HandlerInterceptor1......postHandle");

    }

    //执行Handler完成执行此方法
    //应用场景：统一异常处理，统一日志处理
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
                                Object handler, Exception ex)
            throws Exception {

        System.out.println("HandlerInterceptor1......afterHandle");

    }


}
