package com.tu.learning;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tu.learning.dao")
public class LearningWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearningWebApplication.class, args);
    }
}
