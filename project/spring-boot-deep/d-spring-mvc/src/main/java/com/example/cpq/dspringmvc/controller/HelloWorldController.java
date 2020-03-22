package com.example.cpq.dspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping("")
    public String index() {
        /**
         * 返回值是view name
         * ViewResolver通过view name生成View
         */
        return "index";
    }

}
