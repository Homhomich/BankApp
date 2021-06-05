package com.example.vsucs.services.impl;

import com.example.vsucs.entities.Client;
import com.example.vsucs.repositories.ClientRepository;
import com.example.vsucs.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientServiceImpl(ClientRepository ClientRepository){
        this.clientRepository = ClientRepository;
    }

    @Override
    public Client createClient(Client client) {
            return clientRepository.saveAndFlush(client);
    }

    @Override
    public void deleteClient(long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public Client updateClient(Client client) {
        return clientRepository.saveAndFlush(client);
    }

    @Override
    public Optional<Client> getClientById(long id) {
        return clientRepository.findById(id);
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
}
