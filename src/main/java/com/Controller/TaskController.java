package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 20:23 2018/11/22
 */
@Controller
@RequestMapping("/task")
public class TaskController {

    @RequestMapping(value = "/release",method = RequestMethod.GET)
    public String regist(){


        return "regist";
    }
}
