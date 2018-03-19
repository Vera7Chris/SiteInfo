package com.huanuo.npo.Config;

import org.springframework.context.annotation.Bean;

import javax.xml.ws.BindingType;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public Car car(){
        return  new Car("fxp","lz","haha");
    };
}
