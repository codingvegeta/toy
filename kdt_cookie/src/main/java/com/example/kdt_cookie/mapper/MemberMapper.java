package com.example.kdt_cookie.mapper;

import com.example.kdt_cookie.member.dto.MemberDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Mapper
public interface MemberMapper {
    int signup(MemberDto memberDto);

    MemberDto login(MemberDto memberDto);

    List<HashMap<String, Object>> selectUserCart(String id);

    List<HashMap<String, Object>> selectCart(String id);

    int updateCartAmount(Map<String, String> param);

    int insertCart(Map<String, String> param);

    int deleteCartAll(String param);

    int deleteCart(Map<String, String> param);

    int selectAvailAmount(Map<String, String> param);

    int updateAmountProduct(Map<String, String> param);

    int insertOrderBook(Map<String, String> param);

    int insertOrderDetail(Map<String, String> param);

    List<HashMap<String, Object>> selectOrderDetail(HashMap<String, String> param);

    List<HashMap<String, Object>> selectOrderBook(String id);

}
