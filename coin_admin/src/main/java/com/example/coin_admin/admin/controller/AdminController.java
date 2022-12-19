package com.example.coin_admin.admin.controller;

import com.example.coin_admin.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;

@Controller
public class AdminController {
    @Autowired
    AdminService as;

    @PostMapping("/login")
    public String loginAdmin(String id, String password, HttpSession session) {
        HashMap<String, String> admin = as.loginAdmin(id);
        System.out.println(admin);
        if (admin != null && admin.get("password").equals(password)) {
            session.setAttribute("id", id);
            System.out.println(session.getAttribute("id"));
            return "index";
        }
        return null;
    }

    @GetMapping("/selectCntMember")
    @ResponseBody
    public int selectCntMember() {
        return as.selectCntMember();
    }

    @GetMapping("/selectAmountPayment")
    @ResponseBody
    public int selectAmountPayment() {
        return as.selectAmountPayment();
    }

}
