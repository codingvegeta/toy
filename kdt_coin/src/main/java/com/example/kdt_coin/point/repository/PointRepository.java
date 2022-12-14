package com.example.kdt_coin.point.repository;

import com.example.kdt_coin.mapper.PointMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class PointRepository {
    @Autowired
    PointMapper pm;

    public int insertPayment(HashMap<String, String> payment) {
        return pm.insertPayment(payment);
    }
    public double checkBalance(String email) {
        return pm.checkBalance(email);
    }
}
