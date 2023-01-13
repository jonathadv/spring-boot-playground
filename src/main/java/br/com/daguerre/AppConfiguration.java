package br.com.daguerre;

import br.com.daguerre.domain.sales.ClientEntity;
import br.com.daguerre.domain.sales.ProductEntity;
import br.com.daguerre.service.ClientService;
import br.com.daguerre.service.ProductService;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@DevConfiguration
public class AppConfiguration {
  private ClientService clientService;
  private ProductService productService;

  public AppConfiguration(ClientService clientService, ProductService productService) {
    this.clientService = clientService;
    this.productService = productService;
  }

  @Bean
  public CommandLineRunner run() {
    return args -> {
      System.out.println("#### Adding values to Database ####");

      clientService.saveAll(
          List.of(
              ClientEntity.builder().name("John").build(),
              ClientEntity.builder().name("Lucas").build(),
              ClientEntity.builder().name("Dani").build()));

      productService.saveAll(
          List.of(
              ProductEntity.builder().description("Shirt").price(BigDecimal.valueOf(10.50)).build(),
              ProductEntity.builder().description("Pants").price(BigDecimal.valueOf(20.75)).build(),
              ProductEntity.builder()
                  .description("Shoes")
                  .price(BigDecimal.valueOf(50.75))
                  .build()));
    };
  }
}
