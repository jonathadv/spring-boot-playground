package com.daguerre;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean(name = "applicationName")
    public String applicationName(){
        return "Sales System";
    }

    @Bean(name = "applicationVersion")
    public String applicationVersion(){
        return "1.0";
    }
}
