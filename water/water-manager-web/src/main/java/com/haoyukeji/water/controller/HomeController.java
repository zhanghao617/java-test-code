package com.haoyukeji.water.controller;

import com.haoyukeji.water.entity.TWinfo;
import com.haoyukeji.water.service.TwinfoService;
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
@RequestMapping("/manage")
public class HomeController {

    @Autowired
    private TwinfoService twinfoService;


    /**
     * 首页
     * @param model
     * @return
     */
    @GetMapping("/select")
    public String select(Model model) {
        List<TWinfo> tWinfos = twinfoService.findAll();

        model.addAttribute("waterInfo",tWinfos);
        return "manage/select";
    }

    /**
     * 添加新价格
     * @return
     */
    @GetMapping("/newPrice")
    public String savePrice(){
        return "manage/newPrice";
    }
    @PostMapping("/newPrice")
    public String savePrice(TWinfo tWinfo, RedirectAttributes redirectAttributes) {
        twinfoService.saveNewPrice(tWinfo);
        return "redirect:/manage/select";
    }

    /**
     * 修改价格
     * @param wid
     * @param model
     * @return
     */
    @GetMapping("{wid:\\d+}/edit")
    public String updatePrice(@PathVariable Integer wid,Model model) {
        TWinfo tWinfo = twinfoService.findPriceById(wid);
        model.addAttribute("twinfo",tWinfo);
        return "/manage/editPrice";
    }

    @PostMapping("{wid:\\d+}/edit")
    public String updatePrice(TWinfo tWinfo,RedirectAttributes redirectAttributes) {
        twinfoService.updatePrice(tWinfo);
        redirectAttributes.addFlashAttribute("message","修改成功");
        return "redirect:/manage/select";
    }

    @GetMapping("{id:\\d+}/del")
    public String delPrice(@PathVariable Integer id) {
        twinfoService.delPriceById(id);
        return "";
    }

}
