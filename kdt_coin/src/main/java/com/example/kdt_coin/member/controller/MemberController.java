package com.example.kdt_coin.member.controller;

import com.example.kdt_coin.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
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

    @PostMapping("/login")
    public String loginMember(@RequestParam HashMap<String, String> member, HttpSession session) {
        HashMap<String, String> memberIdPw = memberService.loginMember(member);
        if (memberIdPw != null) {
            session.setAttribute("email", String.valueOf(memberIdPw.get("email")));
            System.out.println(memberIdPw);
        } else {
            return "/signup";
        }
        return "redirect:/";
    }

    @GetMapping("/hadBalance")
    public @ResponseBody int hadBalance(HttpSession session) {
        if (session.getAttribute("email") != null) {
            String email = String.valueOf(session.getAttribute("email"));
            return memberService.hadBalance(email);
        }
        return 0;
    }

}
