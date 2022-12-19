package com.example.coin_admin.admin.service;

import com.example.coin_admin.admin.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

@Repository
public class AdminService {
    @Autowired
    AdminRepository ar;

    public HashMap<String, String> loginAdmin(String id) {
        return ar.loginAdmin(id);
    }

    public ArrayList<HashMap<String, Object>> selectMember() {
        return ar.selectMember();
    }

    public ArrayList<HashMap<String, Object>> selectPayment() {
        return ar.selectPayment();
    }
    public  ArrayList<HashMap<String, Object>> selectBuy() {
        return ar.selectBuy();
    }

    public int selectCntMember() {
        return ar.selectCntMember();
    }

    public int selectAmountPayment() {
        return ar.selectAmountPayment();
    }

    public int selectCntBuy() {
        return ar.selectCntBuy();
    }

    public int selectCntContact() {
        return ar.selectCntContact();
    }
}
