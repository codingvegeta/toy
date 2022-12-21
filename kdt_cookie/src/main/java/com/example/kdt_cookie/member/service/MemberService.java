package com.example.kdt_cookie.member.service;

import com.example.kdt_cookie.member.dto.MemberDto;
import com.example.kdt_cookie.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class MemberService {
    @Autowired
    MemberRepository mr;

    public int signup(MemberDto memberDto) {
        return mr.signup(memberDto);
    }

    public MemberDto login(MemberDto memberDto) {
        return mr.login(memberDto);
    }

}
