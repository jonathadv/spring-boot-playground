package br.com.daguerre.service;

import br.com.daguerre.domain.sales.ProductEntity;
import br.com.daguerre.repository.ProductRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

  private ProductRepository repository;

  public ProductService(ProductRepository repository) {
    this.repository = repository;
  }

  public void save(ProductEntity clientEntity) {
    repository.save(clientEntity);
  }

  public void saveAll(Iterable<ProductEntity> clientEntity) {
    repository.saveAll(clientEntity);
  }

  public List<ProductEntity> findAll() {
    return repository.findAll();
  }
}
