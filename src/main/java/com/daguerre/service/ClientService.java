package com.daguerre.service;

import com.daguerre.domain.sales.ClientEntity;
import com.daguerre.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

  private ClientRepository repository;

  public ClientService(ClientRepository repository) {
    this.repository = repository;
  }

  public void save(ClientEntity clientEntity) {
    repository.save(clientEntity);
  }

  public void saveAll(Iterable<ClientEntity> clientEntity) {
    repository.saveAll(clientEntity);
  }
}
