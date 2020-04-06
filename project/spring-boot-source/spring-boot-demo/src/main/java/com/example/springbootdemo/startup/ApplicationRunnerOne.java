package com.example.springbootdemo.startup;


import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

//未定义@Order排序值
@Component
public class ApplicationRunnerOne implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("#######启动加载器--ApplicationRunnerOne。原始程序参数："+args.getSourceArgs()
                +"。test="+args.getOptionValues("test").toString());
    }

}
