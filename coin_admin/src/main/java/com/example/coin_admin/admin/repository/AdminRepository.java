package com.example.coin_admin.admin.repository;

import com.example.coin_admin.admin.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class AdminRepository {
    @Autowired
    AdminMapper am;

    public HashMap<String, String> loginAdmin(String id) {
        return am.loginAdmin(id);
    }
}
