package com.example.kdt_coin.member.service;

import com.example.kdt_coin.mapper.MemberMapper;
import com.example.kdt_coin.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    public int insertMember(HashMap<String, String> member) {
        return memberRepository.insertMember(member);
    }
}
