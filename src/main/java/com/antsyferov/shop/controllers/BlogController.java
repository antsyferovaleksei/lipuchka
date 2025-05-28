package com.antsyferov.shop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.antsyferov.shop.repo.PostRepository;
import com.antsyferov.shop.models.Post;

@Controller
public class BlogController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/blog")
    public String blog(Model model) {
        model.addAttribute("title", "Блог");
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "lipuchkastore-master/blog";
    }

    @GetMapping("/blog-detail/{id}")
    public String blogDetail(@PathVariable Long id, Model model) {
        model.addAttribute("title", "Деталі блогу");
        model.addAttribute("blogId", id);
        return "lipuchkastore-master/blog-detail";
    }
} 