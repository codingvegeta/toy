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
import java.util.Objects;

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

    @GetMapping("/selectMember")
    @ResponseBody
    public ArrayList<HashMap<String, Object>> selectMember() {
        return as.selectMember();
    }

    @GetMapping("/selectPayment")
    @ResponseBody
    public ArrayList<HashMap<String, Object>> selectPayment() {
        return as.selectPayment();
    }

    @GetMapping("/selectBuy")
    @ResponseBody
    public ArrayList<HashMap<String, Object>> selectBuy() {
        return as.selectBuy();
    }

    @GetMapping("/selectContact")
    @ResponseBody
    public ArrayList<HashMap<String, Object>> selectContact() {
        return as.selectContact();
    }

    @GetMapping("/selectSubscribe")
    @ResponseBody
    public  ArrayList<HashMap<String, Object>> selectSubscribe() {
        return as.selectSubscribe();
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

    @GetMapping("/selectCntBuy")
    @ResponseBody
    public int selectCntBuy() {
        return as.selectCntBuy();
    }

    @GetMapping("/selectCntContact")
    @ResponseBody
    public int selectCntContact() {
        return as.selectCntContact();
    }

}
