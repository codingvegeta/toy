package com.example.kdt_cookie.member.controller;



import com.example.kdt_cookie.member.dto.MemberDto;
import com.example.kdt_cookie.member.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
@Slf4j
@RestController
public class LoginController {
    @Autowired
    MemberService ms;

    @PostMapping("/signup")
    public int signup(MemberDto member){
        return ms.signup(member);
    }
    @PostMapping("/login")
    public String login(MemberDto memberDto, HttpSession session) {
        MemberDto loginMember=ms.login(memberDto);
        if(loginMember!=null) {
            session.setAttribute("id",loginMember);
            log.info("POST /login {} memberId",loginMember);
            return "index";
        }
        return "signup";
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