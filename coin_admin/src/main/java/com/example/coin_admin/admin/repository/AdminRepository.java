package com.example.coin_admin.admin.repository;

import com.example.coin_admin.admin.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

@Repository
public class AdminRepository {
    @Autowired
    AdminMapper am;

    public HashMap<String, String> loginAdmin(String id) {
        return am.loginAdmin(id);
    }

    public ArrayList<HashMap<String, Object>> selectMember() {
        return am.selectMember();
    }

    public ArrayList<HashMap<String, Object>> selectPayment() {
        return am.selectPayment();
    }

    public ArrayList<HashMap<String, Object>> selectBuy() {
        return am.selectBuy();
    }

    public ArrayList<HashMap<String, Object>> selectContact() {
        return am.selectContact();
    }

    public  ArrayList<HashMap<String, Object>> selectSubscribe() {
        return am.selectSubscribe();
    }

    public int selectCntMember() {
        return am.selectCntMember();
    }

    public int selectAmountPayment() {
        return am.selectAmountPayment();
    }

    public int selectCntBuy() {
        return am.selectCntBuy();
    }

    public int selectCntContact() {
        return am.selectCntContact();
    }
}
