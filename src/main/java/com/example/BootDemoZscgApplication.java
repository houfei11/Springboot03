package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Administrator
 */
@SpringBootApplication
@MapperScan("com.example.dao")
public class BootDemoZscgApplication {

    public static void main(String[] args)  {
        SpringApplication.run(BootDemoZscgApplication.class, args);
    }

}
