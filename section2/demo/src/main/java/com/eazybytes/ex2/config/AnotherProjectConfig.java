package com.eazybytes.ex2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnotherProjectConfig {

    @Bean
    String helloWOrld(){
        return "Hello World";
    }

    @Bean
    Integer luckyNumber(){
        return 16;
    }
}
