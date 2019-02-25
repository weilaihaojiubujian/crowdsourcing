package com.Util;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 17:06 2019/2/25
 */
public class SendEmailUtil {
    public static void sendEmail(String email,String Code) throws AddressException, MessagingException
    {
        String host="smtp.qq.com"; //服务商

        String from = "1004758012@qq.com";//发送邮箱

        String to = email;  //接受邮箱

        //获取系统变量
        Properties properties = System.getProperties();

        properties.put("mail.smtp.host", host);

        properties.put("mail.smtp.auth", "true"); // smtp权限验证

        SendEmailAuthUtil authUtil=new SendEmailAuthUtil(from,"dsipfzajnbtpbdgj");

        //创建javaMail运行的环境信息
        Session defaultInstance = Session.getDefaultInstance(properties, authUtil);

        //邮件信息载体,封装者所有的邮件信息MimeMessage 是Message的实现类
        MimeMessage message=new MimeMessage(defaultInstance);

        //设置发件箱地址
        message.setFrom(new InternetAddress(from));

        //设置收件地址(接受者类型和地址，to是主要接收人，还有抄送人，秘密抄送人等)
        message.addRecipients(Message.RecipientType.TO, to);

        //设置邮件标题
        message.setSubject("外包激活邮件通知");

        //设置邮件正文(内容,格式),点击超链接后访问项目的某个方法即可

        String  neirong="<a href='http://localhost:8080/user/activation?code="+Code+"'>请于24小时内点击激活</a>";

        //因为存在汉字,所以直接用gb2312
        message.setContent(neirong, "text/html;charset=utf-8");

        message.saveChanges();

        Transport.send(message); //发送邮件

    }


    /**
     * 定义邮箱权限验证内部类
     */
    public static class SendEmailAuthUtil extends Authenticator
    {
        private String user; //邮箱

        private String password; //授权码


        public SendEmailAuthUtil(String user,String password )
        {
            this.user=user;

            this.password=password;
        }

        //权限验证
        @Override
        protected PasswordAuthentication getPasswordAuthentication()
        {

            return new PasswordAuthentication(user, password);
        }






    }


}
