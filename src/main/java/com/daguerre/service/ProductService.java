package com.daguerre.service;

import com.daguerre.domain.sales.ProductEntity;
import com.daguerre.repository.ProductRepository;
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
