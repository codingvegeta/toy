package com.example.kdt_coin.member.repository;

import com.example.kdt_coin.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class MemberRepository {

    @Autowired
    MemberMapper memberMapper;

    public int insertMember(HashMap<String, String> member) {
        return memberMapper.insertMember(member);
    }

    public HashMap<String, String> loginMember(HashMap<String, String> member) {
        return memberMapper.loginMember(member);
    }


}
