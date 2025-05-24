package com.antsyferov.shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Головна");
        return "lipuchkastore-master/index";
    }

    @GetMapping("/home-02")
    public String home02(Model model) {
        model.addAttribute("title", "Головна 2");
        return "lipuchkastore-master/home-02";
    }

    @GetMapping("/home-03")
    public String home03(Model model) {
        model.addAttribute("title", "Головна 3");
        return "lipuchkastore-master/home-03";
    }
} 