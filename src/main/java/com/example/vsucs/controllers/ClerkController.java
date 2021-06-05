package com.example.vsucs.controllers;

import com.example.vsucs.entities.Clerk;
import com.example.vsucs.services.impl.ClerkServiceImpl;
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
        path = "/bank/clerks",
        produces = MediaType.APPLICATION_JSON_VALUE
)
public class ClerkController {

    private final ClerkServiceImpl clerkService;

    @Autowired
    public ClerkController(final ClerkServiceImpl clerkService) {
        this.clerkService = clerkService;
    }

    @GetMapping
    Optional<Clerk> getClerkById(@RequestParam(name = "search", required = false) Integer search) {
        return clerkService.getClerkById(search);
    }

    @GetMapping("all")
    List<Clerk> getClerks() {
        return clerkService.getAllClerks();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    Clerk create(@RequestBody Clerk clerk) {
        return clerkService.createClerk(clerk);
    }

    @PutMapping("/{id}")
    Clerk update(@RequestBody Clerk clerk) {
        return clerkService.updateClerk(clerk);
    }

    @DeleteMapping("/{id}")
    void remove(@PathVariable("id") int id) {
        clerkService.deleteClerk(id);
    }
}
