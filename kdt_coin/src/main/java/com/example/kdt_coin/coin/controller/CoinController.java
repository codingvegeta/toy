package com.example.kdt_coin.coin.controller;

import com.example.kdt_coin.coin.repository.CoinRepository;
import com.example.kdt_coin.coin.service.CoinService;
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
public class CoinController {
    @Autowired
    CoinService cs;

    @PostMapping("/buyCoin")
    public @ResponseBody String buyCoin(@RequestParam HashMap<String, String> coin, HttpSession session) {
        if (session.getAttribute("email") != null) {
            String email = String.valueOf(session.getAttribute("email"));

            coin.put("email", email);
            System.out.println(coin);

            cs.buyCoin(coin);
            return "구매 성공";
        } else {
            return "구매 실패";
        }
    }

    @GetMapping("/buyList")
    public @ResponseBody ArrayList<HashMap<String, Object>> buyList(HttpSession session) {
        if (session.getAttribute("email") != null) {
            String email = String.valueOf(session.getAttribute("email"));
            return cs.coinList(email);
        } else {
            return null;
        }
    }

}
