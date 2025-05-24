package com.antsyferov.shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopController {

    @GetMapping("/shop")
    public String shop(Model model) {
        model.addAttribute("title", "Магазин");
        return "lipuchkastore-master/product";
    }

    @GetMapping("/product-detail")
    public String productDetail(Model model) {
        model.addAttribute("title", "Деталі товару");
        return "lipuchkastore-master/product-detail";
    }

    @GetMapping("/shoping-cart")
    public String features(Model model) {
        model.addAttribute("title", "Кошик");
        return "lipuchkastore-master/shoping-cart";
    }

    @GetMapping("/blog-detail")
    public String blogDetail(Model model) {
        model.addAttribute("title", "Деталі блогу");
        return "lipuchkastore-master/blog-detail";
    }
} 