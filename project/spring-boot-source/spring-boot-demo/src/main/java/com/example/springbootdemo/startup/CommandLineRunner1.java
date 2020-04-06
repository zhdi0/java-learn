package com.example.springbootdemo.startup;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//未定义@Order排序值
@Component
public class CommandLineRunner1 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("#######启动加载器--CommandLineRunner1");
    }
}
