package com.example.springbootdemo.startup;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Order排序值为2
@Order(2)
@Component
public class ApplicationRunnerTwo implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("#######启动加载器--ApplicationRunnerTwo");
    }
}
