package com.example.vsucs.services.impl;

import com.example.vsucs.entities.Clerk;
import com.example.vsucs.repositories.ApplicationRepository;
import com.example.vsucs.repositories.ClerkRepository;
import com.example.vsucs.services.ClerkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClerkServiceImpl implements ClerkService {

    private ClerkRepository clerkRepository;

    @Autowired
    public ClerkServiceImpl(ClerkRepository clerkRepository){
        this.clerkRepository = clerkRepository;
    }

    @Override
    public Clerk createClerk(Clerk clerk) {
        return clerkRepository.saveAndFlush(clerk);
    }

    @Override
    public void deleteClerk(long id) {
        clerkRepository.deleteById(id);
    }

    @Override
    public Clerk updateClerk(Clerk clerk) {
        return clerkRepository.saveAndFlush(clerk);
    }

    @Override
    public Optional<Clerk> getClerkById(long id) {
        return clerkRepository.findById(id);
    }

    @Override
    public List<Clerk> getAllClerks() {
        return clerkRepository.findAll();
    }
}
