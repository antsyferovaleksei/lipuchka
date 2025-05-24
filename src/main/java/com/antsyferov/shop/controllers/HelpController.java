package com.antsyferov.shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelpController {
    @GetMapping("/help-faq")
    public String helpFaq() {
        return "lipuchkastore-master/help-faq";
    }
} 