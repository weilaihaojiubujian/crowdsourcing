package com.Controller;

import com.Dto.Taskinformation;
import com.Entity.Message;
import com.Entity.User;
import com.Service.MessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 15:46 2018/12/2
 */
@Controller
@RequestMapping("/message")
public class MessageController {


    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    MessageService messageService;

    @RequestMapping(value = "/state/{mid}",method = RequestMethod.GET)
    public ModelAndView usermessage(@PathVariable("mid") int mid){

        ModelAndView m= new ModelAndView();
        Message q=messageService.selectMessage(mid);
        if(q.getState()==0)
        {
            boolean i=messageService.updateMessageState(mid);
            m.setViewName("redirect:/task/message?pageNum=1");
        }
        else
        {
            m.setViewName("redirect:/task/message?pageNum=1");
        }


        return m;
    }

    @RequestMapping(value = "/delete/{mid}",method = RequestMethod.GET)
    public ModelAndView deletemessage(@PathVariable("mid") int mid){

        ModelAndView m= new ModelAndView();

        boolean i=messageService.deleteMessage(mid);
        m.setViewName("redirect:/task/message?pageNum=1");


        return m;
    }
}
