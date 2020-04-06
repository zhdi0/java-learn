package com.example.bspringboot.d_event_2;

import com.example.bspringboot.d_event_2.webrunlistener.WeatherRunListener;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DoWeatherRun {

    @Autowired
    List<WeatherRunListener> weatherRunListenerList;

    /**
     * Test1代码： 构造广播器、给广播器添加监听、构造事件、广播事件
     * 使用RunListener： 注入runListener，调用事件方法
     * 体现出低耦合高内聚的特性
     */
    @Test
    void doRain() {
        for (WeatherRunListener weatherRunListener: weatherRunListenerList){
            weatherRunListener.rain();
        }
    }

    @Test
    void doSnow() {
        for (WeatherRunListener weatherRunListener: weatherRunListenerList){
            weatherRunListener.snow();
        }
    }

}
