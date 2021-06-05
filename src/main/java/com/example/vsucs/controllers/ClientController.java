package com.example.vsucs.controllers;

import com.example.vsucs.entities.Client;
import com.example.vsucs.services.impl.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin
@RestController
@RequestMapping(
        path = "/bank/clients",
        produces = MediaType.APPLICATION_JSON_VALUE
)
public class ClientController {

    private final ClientServiceImpl clientService;

    @Autowired
    public ClientController(final ClientServiceImpl clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    Optional<Client> getClientById(@RequestParam(name = "search", required = false) Integer search) {
        return clientService.getClientById(search);
    }

    @GetMapping("/all")
    List<Client> getClients() {
        return clientService.getAllClients();
    }


    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    Client create(@RequestBody Client client) {
        return clientService.createClient(client);
    }

    @PutMapping("/{id}")
    Client update(@RequestBody Client client) {
       return clientService.updateClient(client);
    }

    @DeleteMapping("/{id}")
    void remove(@PathVariable("id") int id) {
        clientService.deleteClient(id);
    }
}
