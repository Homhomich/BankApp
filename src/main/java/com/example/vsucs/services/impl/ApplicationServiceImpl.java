package com.example.vsucs.services.impl;

import com.example.vsucs.entities.Application;
import com.example.vsucs.entities.Clerk;
import com.example.vsucs.entities.Profit;
import com.example.vsucs.repositories.ApplicationRepository;
import com.example.vsucs.services.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    private final ApplicationRepository applicationRepository;
    private final ProfitServiceImpl profitService;
    private final ClerkServiceImpl clerkService;

    @Autowired
    public ApplicationServiceImpl(ApplicationRepository applicationRepository, final ProfitServiceImpl profitService, final ClerkServiceImpl clerkService) {
        this.applicationRepository = applicationRepository;
        this.profitService = profitService;
        this.clerkService = clerkService;
    }

    @Override
    public Application createApplication(Application application) {
        Optional<Clerk> clerk = Optional.empty();
        if (application.getCost() >= 2000 && application.getCost() <= 5000) {
            clerk = clerkService.getClerkByExperience(3);
        }
        if (application.getCost() >= 5000) {
            clerk = clerkService.getClerkByExperience(5);
        }
        if (application.getCost() < 2000) {
            clerk = clerkService.getClerkByExperience(1);
        }

        if (clerk.isPresent()) {
            Optional<Profit> profit = profitService.getByClerkId(clerk.get().getId());
            profit.ifPresent(value -> {
                value.setAmount(value.getAmount() + application.getCost());
                profitService.updateProfit(value);
            });
        }
        return applicationRepository.saveAndFlush(application);
    }

    @Override
    public void deleteApplication(long id) {
        applicationRepository.deleteById(id);
    }

    @Override
    public Optional<Application> getApplicationById(long id) {
        return applicationRepository.findById(id);
    }

    @Override
    public Application updateApplication(Application application) {
        return applicationRepository.saveAndFlush(application);
    }

    @Override
    public List<Application> getAllApplications() {
        return applicationRepository.findAll();
    }
}
