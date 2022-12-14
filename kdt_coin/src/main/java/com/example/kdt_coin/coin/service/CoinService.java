package com.example.kdt_coin.coin.service;

import com.example.kdt_coin.coin.repository.CoinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class CoinService {

    @Autowired
    CoinRepository cr;

    public int buyCoin(HashMap<String, String> coin) {
        return cr.buyCoin(coin);
    }
}
