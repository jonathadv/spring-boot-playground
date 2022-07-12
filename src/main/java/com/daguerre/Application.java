package com.daguerre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
    @Autowired
    @Qualifier("applicationName")
    String applicationName;

    @Autowired
    @Qualifier("applicationVersion")
    String applicationVersion;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @GetMapping("/hello")
    public String helloWorld(){
        return String.format("%s (v%s)", applicationName, applicationVersion) ;
    }
}
