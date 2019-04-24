package com.mx.controller;

import com.mx.model.UserBean;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class ShiroController {
    //登录
    @RequestMapping("login")
    public String login(){
        return "login";
    }

    //验证失败
    @RequestMapping("errorLogin")
    public String errorLogin(){
        return "login";
    }

    //登陆成功后
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    //注册
    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    public String loginUser(@RequestParam("userName") String userName,@RequestParam("userPassword") String userPassword, HttpSession session){
        System.out.println("userName = [" + userName + "], userPassword = [" + userPassword + "]");
        UsernamePasswordToken token = new UsernamePasswordToken(userName, userPassword);
        Subject subject = SecurityUtils.getSubject();
        subject.login(token);
        UserBean user = (UserBean) subject.getPrincipal();
        session.setAttribute("user",user);
        return "index";
    }
}
