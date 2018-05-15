package com.haoyukeji.controller;

import com.github.pagehelper.PageInfo;
import com.haoyukeji.entity.Product;
import com.haoyukeji.service.SpikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/product")
public class SpikeController {

    @Autowired
    private SpikeService spikeService;

    @GetMapping
    public String home(@RequestParam(required = false,name = "p",defaultValue = "1")Integer pageNo,
                       Model model) {
        PageInfo<Product> pageInfo = spikeService.findProductByPageNo(pageNo);
        model.addAttribute("page",pageInfo);
        return "product/home";
    }

    @GetMapping("/new")
    public String newProduct() {
        return "product/new";
    }

    @PostMapping("/new")
    public String newProduct(Product product) {
        spikeService.saveNewProduct(product);
        return "redirect:/product";
    }

    @GetMapping("/{id:\\d+}/edit")
    public String updateProduct(@PathVariable Integer id, Model model) {
        Product product = spikeService.findProById(id);
        model.addAttribute("product",product);
        return "product/edit";
    }



}
