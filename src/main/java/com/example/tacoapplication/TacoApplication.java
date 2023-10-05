package com.example.tacoapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class TacoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TacoApplication.class, args);
    }

}
