package com.example.kdt_coin.coin.repository;

import com.example.kdt_coin.mapper.CoinMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class CoinRepository {
    @Autowired
    CoinMapper cm;

    public int buyCoin(HashMap<String, String> coin) {
        return cm.buyCoin(coin);
    }

    public ArrayList<HashMap<String, Object>> coinList(String email) {
        return cm.coinList(email);
    }

}
