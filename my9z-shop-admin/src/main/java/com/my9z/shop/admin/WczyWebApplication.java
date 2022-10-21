package com.my9z.shop.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @description: web启动类
 * @author: wczy9
 * @createTime: 2022-10-21  12:30
 */
@SpringBootApplication
@ComponentScan("com.my9z.shop")
public class WczyWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WczyWebApplication.class, args);
    }

}
