package com.haoyukeji.water.controller;

import com.haoyukeji.water.entity.Account;
import com.haoyukeji.water.service.AccountService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/manage/user")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping
    public String show(Model model) {
        List<Account> accountList = accountService.findAll();
        model.addAttribute("accountList",accountList);
        return "/manage/user/show";
    }


    @GetMapping("{id:\\d+}/edit")
    public String updateAccount(@PathVariable Integer id, Model model) {

        Account account = accountService.findById(id);
        model.addAttribute("account",account);
        return "/manage/user/edit";
    }
}
