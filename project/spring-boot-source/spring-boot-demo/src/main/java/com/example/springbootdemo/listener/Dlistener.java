package com.example.springbootdemo.listener;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.GenericApplicationListener;
import org.springframework.core.ResolvableType;
import org.springframework.core.annotation.Order;

/**
 * GenericApplicationListener是标准ApplicationListener接口的扩展变体，
 * 公开了其他元数据，例如受支持的事件和源类型。
 * 从Spring Framework 4.2开始，此接口取代了基于类的SmartApplicationListener，并全面处理了通用事件类型。
 */
@Order(4)
public class Dlistener implements GenericApplicationListener {

    // 此监听器支持的事件类型
    @Override
    public boolean supportsEventType(ResolvableType eventType) {
        // 监听ApplicationStartingEvent、ApplicationReadyEvent事件
        return eventType.isAssignableFrom(ApplicationStartingEvent.class)
                || eventType.isAssignableFrom(ApplicationStartedEvent.class);
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("####Dlistener监听到"+event.getClass().getSimpleName());
    }

}

















