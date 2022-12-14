package com.example.kdt_coin.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

@Mapper
public interface MemberMapper {
    int insertMember(HashMap<String, String> member);

    HashMap<String, String> loginMember(HashMap<String, String> member);

    int hadBalance(String email);

    ArrayList<HashMap<String, Objects>> havingBalance(String email);

    int moneyBalance(String email);
}
