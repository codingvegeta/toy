package com.example.kdt_cookie.member.repository;

import com.example.kdt_cookie.mapper.MemberMapper;
import com.example.kdt_cookie.member.dto.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class MemberRepository {
    @Autowired
    MemberMapper mm;

    public int signup(MemberDto memberDto) {
        return mm.signup(memberDto);
    }

    public MemberDto login(MemberDto memberDto) {
        return mm.login(memberDto);
    }
}
