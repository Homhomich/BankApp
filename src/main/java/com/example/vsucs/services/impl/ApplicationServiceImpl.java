package com.example.vsucs.services.impl;

import com.example.vsucs.entities.Application;
import com.example.vsucs.repositories.ApplicationRepository;
import com.example.vsucs.services.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    private ApplicationRepository applicationRepository;

    @Autowired
    public ApplicationServiceImpl(ApplicationRepository applicationRepository){
        this.applicationRepository = applicationRepository;
    }

    @Override
    public Application createApplication(Application application) {
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
