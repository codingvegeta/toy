package com.example.coin_admin.admin.controller;

import com.example.coin_admin.admin.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;

@Api(tags = {"관리자 조회 서비스"}, description = "관리자 조회 서비스")
@Controller
public class AdminController {
    @Autowired
    AdminService as;

    @ApiOperation(value = "총 회원 정보", notes = "총 회원 정보를 조회한다.")
    @GetMapping("/selectMember")
    @ResponseBody
    public ArrayList<HashMap<String, Object>> selectMember() {
        return as.selectMember();
    }

    @GetMapping("/selectPayment")
    @ResponseBody
    public ArrayList<HashMap<String, Object>> selectPayment() {
        return as.selectPayment();
    }

    @GetMapping("/selectBuy")
    @ResponseBody
    public ArrayList<HashMap<String, Object>> selectBuy() {
        return as.selectBuy();
    }

    @GetMapping("/selectContact")
    @ResponseBody
    public ArrayList<HashMap<String, Object>> selectContact() {
        return as.selectContact();
    }

    @GetMapping("/selectSubscribe")
    @ResponseBody
    public ArrayList<HashMap<String, Object>> selectSubscribe() {
        return as.selectSubscribe();
    }

    @GetMapping("/selectCntMember")
    @ResponseBody
    public int selectCntMember() {
        return as.selectCntMember();
    }

    @GetMapping("/selectAmountPayment")
    @ResponseBody
    public int selectAmountPayment() {
        return as.selectAmountPayment();
    }

    @GetMapping("/selectCntBuy")
    @ResponseBody
    public int selectCntBuy() {
        return as.selectCntBuy();
    }

    @GetMapping("/selectCntContact")
    @ResponseBody
    public int selectCntContact() {
        return as.selectCntContact();
    }

}
