package br.com.daguerre.service;

import br.com.daguerre.domain.sales.ClientEntity;
import br.com.daguerre.repository.ClientRepository;
import java.util.List;
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

  public List<ClientEntity> findAll() {
    return repository.findAll();
  }
}
