package com.example.kdt_coin.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface MemberMapper {
    int insertMember(HashMap<String, String> member);

    HashMap<String, String> loginMember(HashMap<String, String> member);
}
