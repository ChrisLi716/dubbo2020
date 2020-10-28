package com.chris.user;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.chris.user") //开启基于注解的dubbo功能
public class UserMain {

    public static void main(String[] args) {
        SpringApplication.run(UserMain.class, args);
    }
}
