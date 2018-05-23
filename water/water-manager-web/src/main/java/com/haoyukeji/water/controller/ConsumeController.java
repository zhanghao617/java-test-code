package com.haoyukeji.water.controller;

import com.haoyukeji.water.entity.Account;
import com.haoyukeji.water.entity.TMinfo;
import com.haoyukeji.water.service.AccountService;
import com.haoyukeji.water.service.TminfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/manage/consumer")
public class ConsumeController {

    @Autowired
    private TminfoService tminfoService;

    @Autowired
    private AccountService accountService;

    @GetMapping("/home")
    public String home(Model model){
        List<TMinfo> tMinfos = tminfoService.findAllConsumer();

        model.addAttribute("tminfo",tMinfos);
        return "/manage/consumer/home";
    }

    @GetMapping("{id:\\d+}/edit")
    public String editConsume(@PathVariable Integer id,Model model) {
        TMinfo tMinfo = tminfoService.findConsumerById(id);
        Account account = accountService.findById(tMinfo.getaId());
        model.addAttribute("account",account);
        model.addAttribute("tminfo",tMinfo);
        return "/manage/consumer/edit";
    }
    @PostMapping("{id:\\d+}/edit")
    public String editConsume(TMinfo tMinfo, RedirectAttributes redirectAttributes){
        tminfoService.updateConsumer(tMinfo);
        return "redirect:/manage/consumer/home";
    }

}
