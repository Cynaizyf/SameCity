package com.example.samecity;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.samecity.dao")
public class SamecityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SamecityApplication.class, args);
    }
}
