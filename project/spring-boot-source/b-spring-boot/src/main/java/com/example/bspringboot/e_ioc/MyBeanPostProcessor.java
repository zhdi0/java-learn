//package com.example.bspringboot.e_ioc;
//
//import com.example.bspringboot.e_ioc.bean.GetBeanTest;
//import org.springframework.beans.BeansException;
//import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
//import org.springframework.stereotype.Component;
//
//
///**
// * 一般不会通过实现InstantiationAwareBeanPostProcessor来注入修改bean
// */
//@Component
//public class MyBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
//
//    @Override
//    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
//        return beanName.equals("getBeanTest") ? new GetBeanTest() : null;
//    }
//
//    @Override
//    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
//        if (beanName.equals("getBeanTest")) {
//            GetBeanTest getBeanTest = (GetBeanTest) bean;
//            getBeanTest.setName("wangwu");
//        }
//        return false;
//    }
//}
