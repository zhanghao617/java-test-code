package com.haoyukeji.water.controller;

import com.haoyukeji.water.entity.TMinfo;
import com.haoyukeji.water.service.TminfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/manage/pay")
public class PayController {

    @Autowired
    private TminfoService tminfoService;

    @GetMapping
    public String pay() {
        return "/manage/pay/pay";
    }
    @PostMapping
    public String pay(Double eletricMoney, RedirectAttributes redirectAttributes) {
        TMinfo tMinfo = new TMinfo();
        tMinfo.setEletricmoney(tMinfo.getEletricmoney() + eletricMoney);

        tminfoService.saveEletricmoney(tMinfo);
        redirectAttributes.addFlashAttribute("message","缴费成功");
        return "redirect:/manage/consumer/home";
    }
}
