package com.example.kdt_coin.point.service;

import com.example.kdt_coin.point.repository.PointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class PointService {
    @Autowired
    PointRepository pr;

    public int insertPayment(HashMap<String, String> payment) {
        return pr.insertPayment(payment);
    }
}
