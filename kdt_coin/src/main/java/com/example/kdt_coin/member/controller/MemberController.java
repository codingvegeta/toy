package com.example.kdt_coin.member.controller;

import com.example.kdt_coin.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Controller
public class MemberController {

    @Autowired
    MemberService memberService;

    @PostMapping("/signup")
    public String insertMember(@RequestParam HashMap<String, String> member) {
        System.out.println(member);
        memberService.insertMember(member);
        return "redirect:/";
    }
}
