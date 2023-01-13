package com.daguerre;

import com.daguerre.domain.sales.ClientEntity;
import com.daguerre.service.ClientService;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@DevConfiguration
public class AppConfiguration {
  private ClientService clientService;

  public AppConfiguration(ClientService clientService) {
    this.clientService = clientService;
  }

  @Bean
  public CommandLineRunner run() {
    return args -> {
      System.out.println("#### Running development profile ####");
      clientService.saveAll(
          List.of(
              ClientEntity.builder().name("John").build(),
              ClientEntity.builder().name("Lucas").build(),
              ClientEntity.builder().name("Dani").build()));
    };
  }
}
