package com.haoyukeji.water.controller;

import com.haoyukeji.water.entity.Account;
import com.haoyukeji.water.service.LoginService;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.util.SavedRequest;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {


    @Autowired
    private LoginService loginService;

    /**
     * 登陆页
     * @return
     */
    @GetMapping("/")
    public String loginAccount() {
        Subject subject = SecurityUtils.getSubject();

        //判断是否认证，false退出
        if(subject.isAuthenticated()) {
            subject.logout();
        }
        //判断是否被记住，ture跳转home页，false：登陆页
        if (subject.isRemembered()) {
            return "redirect:/home";
        }
        return "login";
    }

    @PostMapping("/")
    public String loginingAccount(String phone,
                           String password,
                           String rememberMe,
                           HttpServletRequest request,
                           RedirectAttributes redirectAttributes) {

        Subject subject = SecurityUtils.getSubject();
        String requestIP = request.getRemoteAddr();
        UsernamePasswordToken usernamePasswordToken =
                new UsernamePasswordToken(phone, DigestUtils.md5Hex(password),rememberMe != null,requestIP);

        try {
            subject.login(usernamePasswordToken);

            //登录后跳转目标的判断
            SavedRequest savedRequest = WebUtils.getSavedRequest(request);
            String url = "/home";
            if (savedRequest != null) {
                url = savedRequest.getRequestUrl();
            }
            return "redirect:" + url;
        }catch (UnknownAccountException | IncorrectCredentialsException ex) {
            ex.printStackTrace();
            redirectAttributes.addFlashAttribute("message","账号或密码错误");
        } catch (LockedAccountException ex) {
            ex.printStackTrace();
            redirectAttributes.addFlashAttribute("message","账号被锁定");
        } catch (AuthenticationException ex) {
            ex.printStackTrace();
            redirectAttributes.addFlashAttribute("message","账号或密码错误");
        }
        return "redirect:/";
    }

    /**
     * 注册账号
     * @return
     */
    @GetMapping("/register")
    public String registerAccount() {
        return "/register";
    }

    @PostMapping("/register")
    public String registerAccount(Account account,RedirectAttributes redirectAttributes) {
        account.setPassword(DigestUtils.md5Hex(account.getPassword()));
        loginService.saveNewAccount(account);

        redirectAttributes.addFlashAttribute("message","注册成功");
        return "redirect:/";
    }

    /**
     * 登陆成功后跳转的页面
     */
    @GetMapping("/home")
    public String home() {
        return "home";
    }

    /**
     * 退出
     * @param redirectAttributes
     * @return
     */
    @GetMapping("/logout")
    public String logout(RedirectAttributes redirectAttributes) {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();

        redirectAttributes.addFlashAttribute("message","你已安全退出");
        return "redirect:/";
    }


    @GetMapping("/401")
    public String unauthorizedUrl() {
        return "error/401";
    }

}
