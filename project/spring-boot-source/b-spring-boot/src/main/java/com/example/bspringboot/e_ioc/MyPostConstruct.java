package com.example.bspringboot.e_ioc;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author chenpiqian
 * @date: 2020-02-20
 */
@Component
public class MyPostConstruct {

/**
 * bean初始化完成，依赖注入完成 后调用
 */
    @PostConstruct
    public void init(){
        System.out.println("################init##########");
    }
}
