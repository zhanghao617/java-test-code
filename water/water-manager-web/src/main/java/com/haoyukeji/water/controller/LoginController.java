package com.haoyukeji.water.controller;

import com.haoyukeji.water.service.LoginService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/")
    public String login() {
        Subject subject = SecurityUtils.getSubject();

        //判断是否认证，false退出
        if(subject.isAuthenticated()) {
            subject.logout();
        }
        //判断是否被记住，ture跳转home页，false：登陆页
        if (subject.isRemembered()) {
            return "redirect:/home";
        }
        return "loginss";
    }




}
