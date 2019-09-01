package com.example.codepassowrd.social;

import com.example.codepassowrd.social.qq.connect.QQConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.social.UserIdSource;
import org.springframework.social.config.annotation.ConnectionFactoryConfigurer;
import org.springframework.social.config.annotation.EnableSocial;
import org.springframework.social.config.annotation.SocialConfigurerAdapter;
import org.springframework.social.connect.ConnectionFactory;
import org.springframework.social.connect.ConnectionFactoryLocator;
import org.springframework.social.connect.UsersConnectionRepository;
import org.springframework.social.connect.jdbc.JdbcUsersConnectionRepository;
import org.springframework.social.security.AuthenticationNameUserIdSource;
import org.springframework.social.security.SpringSocialConfigurer;

import javax.sql.DataSource;


@EnableSocial
@Configuration
//@ConditionalOnProperty(prefix = "social.qq", name = "app-id") 暂无效
public class SocialConfigurer extends SocialConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Value("${social.qq.provider-id}")
    String providerId;
    @Value("${social.qq.app-id}")
    String appId;
    @Value("${social.qq.app-secret}")
    String appSecret;

    @Override
    public void addConnectionFactories(ConnectionFactoryConfigurer configurer,
                                       Environment environment) {
        configurer.addConnectionFactory(createConnectionFactory());
    }

    public ConnectionFactory createConnectionFactory(){
        return new QQConnectionFactory(providerId, appId, appSecret);
    }

    @Override
    public UserIdSource getUserIdSource() {
        return new AuthenticationNameUserIdSource();
    }

    /**
     * 需要在数据库建表  UserConnection
     * 建表SQL在JdbcUsersConnectionRepository.java同一个包中
     */
    @Override
    public UsersConnectionRepository getUsersConnectionRepository(ConnectionFactoryLocator connectionFactoryLocator) {
        JdbcUsersConnectionRepository repository = new JdbcUsersConnectionRepository(dataSource, connectionFactoryLocator, Encryptors.noOpText());
        return repository;
    }


    // 社交配置类，需要apply到CustomWebSecurityConfiguration中
    @Bean
    public SpringSocialConfigurer springSocialConfigurer(){
        return new SpringSocialConfigurer();
    }


}