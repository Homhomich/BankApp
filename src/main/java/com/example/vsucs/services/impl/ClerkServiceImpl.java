package com.example.vsucs.services.impl;

import com.example.vsucs.entities.Clerk;
import com.example.vsucs.entities.Profit;
import com.example.vsucs.repositories.ClerkRepository;
import com.example.vsucs.services.ClerkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClerkServiceImpl implements ClerkService {

    private final ClerkRepository clerkRepository;
    private final ProfitServiceImpl profitService;


    @Autowired
    public ClerkServiceImpl(ClerkRepository clerkRepository,  final ProfitServiceImpl profitService){
        this.clerkRepository = clerkRepository;
        this.profitService = profitService;
    }

    @Override
    public Clerk createClerk(Clerk clerk) {
        Clerk createdClerk = clerkRepository.saveAndFlush(clerk);
        Profit profit = new Profit(0, createdClerk.getId());
        profitService.createProfit(profit);
        return createdClerk;
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

    @Override
    public Optional<Clerk> getClerkByExperience(int experience) {
        return clerkRepository.getClerkByExperienceIsGreaterThanEqual(experience);
    }
}
