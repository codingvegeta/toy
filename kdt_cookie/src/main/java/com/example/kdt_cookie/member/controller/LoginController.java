package com.example.kdt_cookie.member.controller;



import com.example.kdt_cookie.member.dto.MemberDto;
import com.example.kdt_cookie.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class LoginController {
    @Autowired
    MemberService ms;

    @PostMapping("/signup")
    public int signup(MemberDto member){
        return ms.signup(member);
    }
    @PostMapping("/login")
    public MemberDto login(MemberDto memberDto, HttpSession session) {
        MemberDto loginMember=ms.login(memberDto);
        if(loginMember!=null) {
            session.setAttribute("id",loginMember);
            return loginMember;
        }
        return null;
    }

    @PostMapping("/logout")
    public String logout(HttpSession session) {
        if(session.getAttribute("id")!=null){
            session.setAttribute("id",null);
            return "success";
        }else{
            return "failed";
        }
    }


    @PostMapping("/checkLogin")
    public String checkLogin(HttpSession session) {

        if (session.getAttribute("id") != null) {
            return "logged";
        } else {
            return "need";
        }
    }

}