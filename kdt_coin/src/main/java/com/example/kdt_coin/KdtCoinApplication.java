package com.example.kdt_coin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@MapperScan(value = {"com.example.kdt_coin.mapper"})
@MapperScan("com.example.kdt_coin.mapper")
@SpringBootApplication
public class KdtCoinApplication {

    public static void main(String[] args) {
        SpringApplication.run(KdtCoinApplication.class, args);
    }

}
