package com.example.bspringboot.h_properties;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * 实现EnvironmentAware来获取环境配置属性，但本类还是要加入到spring容器中
 */
@Component
public class MyEnvironmentAware implements EnvironmentAware {

    private static Environment env;

    public static String getPropertyKey(){
        String pk = env.getProperty("property.key");
        System.out.println(pk);
        return pk;
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.env = environment;
    }

}
