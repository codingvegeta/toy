package com.example.kdt_coin.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface PointMapper {
    int insertPayment(HashMap<String, String> payment);
}
