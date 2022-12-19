package com.example.coin_admin.admin.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

@Mapper
public interface AdminMapper {
    HashMap<String, String> loginAdmin(String id);

    ArrayList<HashMap<String, Object>> selectMember();

    int selectCntMember();

    int selectAmountPayment();

    int selectCntBuy();

    int selectCntContact();
}
