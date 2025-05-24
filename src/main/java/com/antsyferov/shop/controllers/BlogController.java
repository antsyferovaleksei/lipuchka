package com.antsyferov.shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BlogController {

    @GetMapping("/blog")
    public String blog(Model model) {
        model.addAttribute("title", "Блог");
        return "cozastore-master/blog";
    }

    @GetMapping("/blog-detail/{id}")
    public String blogDetail(@PathVariable Long id, Model model) {
        model.addAttribute("title", "Деталі блогу");
        model.addAttribute("blogId", id);
        return "cozastore-master/blog-detail";
    }
} 