package com.example.kdt_coin.point.controller;

import com.example.kdt_coin.point.service.PointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@RestController
public class PointController {

    @Autowired
    PointService ps;

    @GetMapping("/point")
    public String insertPayment(@RequestParam HashMap<String, String> payment, HttpSession session) {
        if (session.getAttribute("email") != null) {
            System.out.println(payment);

            String email = String.valueOf(session.getAttribute("email"));
            payment.put("email", email);

            ps.insertPayment(payment);
        } else {
            return "로그인 해주세요";
        }
        return "충전에 성공 하였습니다.";
    }
}
