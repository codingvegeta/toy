package com.example.kdt_coin.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface CoinMapper {

    int buyCoin(HashMap<String, String> coin);

    ArrayList<HashMap<String, Object>> coinList(String email);
}
