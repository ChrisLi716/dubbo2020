package com.chris.user;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MainTest {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml");
        ioc.start();
        System.in.read();
    }
}
