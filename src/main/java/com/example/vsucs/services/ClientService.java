package com.example.vsucs.services;

import com.example.vsucs.entities.Client;

import java.util.List;

public interface ClientService {
    Client createClient(Client client);
    void deleteClient(long id);
    Client updateClient(Client client);
    Client getClientById(long id);
    List<Client> getAllClients ();
}
