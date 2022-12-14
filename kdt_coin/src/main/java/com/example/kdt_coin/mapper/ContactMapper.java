package com.example.kdt_coin.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface ContactMapper {
    int insertContact(HashMap<String, String> contact);

    int insertSubscribe(HashMap<String, String> subscribe);
}
