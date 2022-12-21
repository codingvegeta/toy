package com.example.kdt_cookie.member.controller;

import com.example.kdt_cookie.member.dto.MemberDto;
import com.example.kdt_cookie.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class MemberController {
    @Autowired
    MemberService ms;

    @PostMapping("/signup")
    @ResponseBody
    public int signup(MemberDto memberDto) {
        return ms.signup(memberDto);
    }

    @PostMapping("/login")
    @ResponseBody
    public String login(MemberDto memberDto, HttpSession session) {
        if (ms.login(memberDto) != null) {
            session.setAttribute("id", memberDto.getId());
            return "/index";
        }
        return "redirect:/";
    }

    @PostMapping("/logout")
    @ResponseBody
    public String logout(HttpSession session) {
        if (session.getAttribute("id") != null) {
            session.removeAttribute("id");
            return "success";
        }
        return null;
    }

}
