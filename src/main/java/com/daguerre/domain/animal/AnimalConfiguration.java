package com.daguerre.domain.animal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnimalConfiguration {

  @Bean
  public Animal dog() {
    return new Animal() {
      @Override
      public String speak() {
        return "Woof";
      }
    };
  }

  @Bean
  public Animal cat() {
    return new Animal() {
      @Override
      public String speak() {
        return "Meow";
      }
    };
  }
}
