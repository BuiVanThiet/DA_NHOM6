package com.nhom_6.duan_1.controller.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/blog-details")
public class BlogDetailsController {

    @GetMapping
    public String blogDetails(Model model) {
        model.addAttribute("page", "blog-details");
        return "layout/index";
    }
}
