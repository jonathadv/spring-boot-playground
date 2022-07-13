package com.daguerre.service;

import com.daguerre.model.Client;
import com.daguerre.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private ClientRepository repository;

    public ClientService(ClientRepository repository){
        this.repository = repository;
    }

    public void saveClient(Client client) {
        validateClient(client);
        repository.persistClient(client);
    }

    public void validateClient(Client client) {

    }
}
