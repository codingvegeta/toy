package com.example.coin_admin.admin.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface AdminMapper {
    HashMap<String, String> loginAdmin(String id);
}
