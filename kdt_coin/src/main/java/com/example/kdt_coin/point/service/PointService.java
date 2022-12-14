package com.example.kdt_coin.point.service;

import com.example.kdt_coin.point.repository.PointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class PointService {
    @Autowired
    PointRepository pr;

    public int insertPayment(HashMap<String, String> payment) {
        return pr.insertPayment(payment);
    }
    public double checkBalance(String email) {
        return pr.checkBalance(email);
    }

    public ArrayList<HashMap<String, Object>> pointList(String email) {
        return pr.pointList(email);
    }
}
