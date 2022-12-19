package com.example.coin_admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.example.coin_admin.admin.mapper")
public class CoinAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoinAdminApplication.class, args);
	}

}
