package com.daguerre;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class AppConfiguration {

    @Bean
    public CommandLineRunner run(){
        return args -> {
            System.out.println("#### Running development profile ####");
        };
    }
}
