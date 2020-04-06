package com.example.bspringboot.e_ioc;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author chenpiqian
 * @date: 2020-02-20
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    /**
     * bean加载后修改bean的属性，甚至重新初始化bean
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition teacher = beanFactory.getBeanDefinition("teacher");
        MutablePropertyValues propertyValues = teacher.getPropertyValues();
        propertyValues.addPropertyValue("name", "wangwu");
    }

}
