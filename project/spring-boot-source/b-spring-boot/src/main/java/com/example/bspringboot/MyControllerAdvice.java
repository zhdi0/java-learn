package com.example.bspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

// 全局异常处理器
@ControllerAdvice
public class MyControllerAdvice {

    final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public String errorHandler(Exception ex) {
        LOGGER.error("发生异常", ex);

        return ex.getMessage();
    }

}
