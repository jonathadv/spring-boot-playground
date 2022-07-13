package com.daguerre;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@DevConfiguration
public class AppConfiguration {

    @Bean
    public CommandLineRunner run(){
        return args -> {
            System.out.println("#### Running development profile ####");
        };
    }
}
