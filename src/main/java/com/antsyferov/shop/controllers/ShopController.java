package com.antsyferov.shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ShopController {

    @GetMapping("/shop")
    public String shop(Model model) {
        model.addAttribute("title", "Магазин");
        return "cozastore-master/product";
    }

    @GetMapping("/product-detail/{id}")
    public String productDetail(@PathVariable Long id, Model model) {
        model.addAttribute("title", "Деталі товару");
        model.addAttribute("productId", id);
        return "cozastore-master/product-detail";
    }

    @GetMapping("/cart")
    public String cart(Model model) {
        model.addAttribute("title", "Кошик");
        return "cozastore-master/shoping-cart";
    }
} 