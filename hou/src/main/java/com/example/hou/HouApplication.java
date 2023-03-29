package com.example.hou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@MapperScan("com.example.hou")//程序入口   mapper和dao选其一即可 要和自己的路径对应
public class HouApplication {
    public static void main(String[] args) {
        SpringApplication.run(HouApplication.class, args);



    }
}
