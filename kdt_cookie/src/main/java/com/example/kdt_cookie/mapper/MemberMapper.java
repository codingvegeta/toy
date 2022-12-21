package com.example.kdt_cookie.mapper;

import com.example.kdt_cookie.member.dto.MemberDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface MemberMapper {
    int signup(MemberDto memberDto);

    MemberDto login(MemberDto memberDto);

}
