package com.example.springbootdemo.startup;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Order排序值为2
@Order(2)
@Component
public class CommandLineRunner2 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("#######启动加载器--CommandLineRunner2");
    }
}
