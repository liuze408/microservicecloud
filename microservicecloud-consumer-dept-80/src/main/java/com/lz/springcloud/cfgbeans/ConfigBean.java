package com.lz.springcloud.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
//boot ->spring applicationContext.xml --@Configruation配置
//即 ConfigBean = applicationContext.xml

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}

//    @Bean
//    public UserService getUserService(){
//        return new UserServiceImpl();
//    }
//applicationContext.xml
//<bean id-"userService" class="com.lz.tmall.UserServiceImpl"/>