package com.example.coin_admin.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/")
    public String goLogin() {
        return "login";
    }

    @GetMapping("/index")
    public String goIndex() {
        return "index";
    }
}
