package com.example.kdt_coin.contact.controller;

import com.example.kdt_coin.contact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Controller
public class ContactController {

    @Autowired
    ContactService cs;
    @PostMapping("/requestCall")
    public String insertContact(@RequestParam HashMap<String, String> contact) {
        cs.insertContact(contact);
        System.out.println(contact);
        return "redirect:/";
    }
}
