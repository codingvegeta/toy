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

    @GetMapping("goMember")
    public String goMember() {
        return "memberList";
    }

    @GetMapping("/goPayment")
    public String goPayment() {
        return "paymentList";
    }

    @GetMapping("goBuy")
    public String goBuy() {
        return "buyList";
    }

    /**
     * "/goContact">연락요청목록</a>
     * <h6 class="collapse-header">구독관리</h6>
     * <a class="collapse-item" href="/goSubscribe"
     */
    @GetMapping("/goContact")
    public String goContact() {
        return "contactList";
    }

    @GetMapping("/goSubscribe")
    public String goSubscribe() {
        return "subscribeList";
    }
}
