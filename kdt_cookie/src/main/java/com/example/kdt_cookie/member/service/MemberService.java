package com.example.kdt_cookie.member.service;

import com.example.kdt_cookie.member.dto.MemberDto;
import com.example.kdt_cookie.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MemberService {
    @Autowired
    MemberRepository mr;

    public int signup(MemberDto member){
        int result=0;
        try{
            result=mr.signup(member);
        }catch(Exception e){
            result=-1;
        }

        return result;
    }

    public MemberDto login(MemberDto member){
        return mr.login(member);

    }

    public List<HashMap<String,Object>> selectUserCart(String id){
        return mr.selectUserCart(id);
    }
    public List<HashMap<String,Object>>  selectCart(String id){
        return mr.selectCart(id);

    }
    public int updateCartAmount(Map<String,String> param){
        return mr.updateCartAmount(param);
    }
    public int insertCart(Map<String,String> param){
        return mr.insertCart(param);

    }
    public int selectAvailAmount(Map<String,String> param){
        return mr.selectAvailAmount(param);
    }
    public int deleteCart(Map<String,String> param){
        return mr.deleteCart(param);
    }
    public int deleteCartAll(String param){
        return mr.deleteCartAll(param);
    }
    public int updateAmountProduct(Map<String, String> param) {
        return mr.updateAmountProduct(param);
    }

    public int insertOrderBook(Map<String, String> param) {
        return mr.insertOrderBook(param);
    }

    public int insertOrderDetail(Map<String, String> param) {
        return mr.insertOrderDetail(param);
    }

    public List<HashMap<String, Object>> selectOrderBook(String id) {
        return mr.selectOrderBook(id);

    }
    public List<HashMap<String, Object>> selectOrderDetail(HashMap<String, String> params) {
        return mr.selectOrderDetail(params);

    }
}
