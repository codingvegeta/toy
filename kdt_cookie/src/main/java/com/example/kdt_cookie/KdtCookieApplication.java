package com.example.kdt_cookie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.kdt_cookie.mapper")
public class KdtCookieApplication {

	public static void main(String[] args) {
		SpringApplication.run(KdtCookieApplication.class, args);
	}

}
