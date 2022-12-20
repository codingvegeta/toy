package com.example.coin_admin.admin.controller;

import com.example.coin_admin.admin.dto.AdminDTO;
import com.example.coin_admin.admin.service.AdminService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
public class AdminLoginController {
    @Autowired
    AdminService as;

    @PostMapping("/login")
    @ApiOperation(value = "관리자 인증 정보 CHECK", notes = "인증된 관리자인지 판단하는 API입니다.")
    @ApiImplicitParams(value = {
            @ApiImplicitParam(name = "id", value = "사용자 식별 ID", required = true),
            @ApiImplicitParam(name = "password", value = "사용자 비밀번호", required = true)
    })
    public String loginAdmin(AdminDTO dto, @ApiIgnore HttpSession session) {
        HashMap<String, String> admin = as.loginAdmin(dto.getId());
        System.out.println(admin);
        if (admin != null && admin.get("password").equals(dto.getPassword())) {
            session.setAttribute("id", dto.getId());
            System.out.println(session.getAttribute("id"));
            return "index";
        }
        return "redirect:/";
    }
}
