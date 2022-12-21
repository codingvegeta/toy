package com.example.kdt_cookie.member.repository;

import com.example.kdt_cookie.mapper.MemberMapper;
import com.example.kdt_cookie.member.dto.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public List<HashMap<String, Object>> selectUserCart(String id) {
        return mm.selectUserCart(id);
    }

    public List<HashMap<String, Object>> selectCart(String id) {
        return mm.selectCart(id);
    }

    public int updateCartAmount(Map<String, String> param) {
        return mm.updateCartAmount(param);
    }

    public int insertCart(Map<String, String> param) {
        return mm.insertCart(param);
    }

    public int selectAvailAmount(Map<String, String> param) {
        return mm.selectAvailAmount(param);
    }

    public int deleteCart(Map<String, String> param) {
        return mm.deleteCart(param);
    }

    public int deleteCartAll(String param) {
        return mm.deleteCartAll(param);
    }

    public int updateAmountProduct(Map<String, String> param) {
        return mm.updateAmountProduct(param);
    }

    public int insertOrderBook(Map<String, String> param) {
        return mm.insertOrderBook(param);
    }

    public int insertOrderDetail(Map<String, String> param) {
        return mm.insertOrderDetail(param);
    }

    public List<HashMap<String, Object>> selectOrderBook(String id) {
        return mm.selectOrderBook(id);
    }

    public List<HashMap<String, Object>> selectOrderDetail(HashMap<String, String> params) {
        return mm.selectOrderDetail(params);
    }
}
