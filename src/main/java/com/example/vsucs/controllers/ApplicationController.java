package com.example.vsucs.controllers;

import com.example.vsucs.entities.Application;
import com.example.vsucs.entities.Profit;
import com.example.vsucs.services.impl.ApplicationServiceImpl;
import com.example.vsucs.services.impl.ProfitServiceImpl;
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
        path = "/bank/applications",
        produces = MediaType.APPLICATION_JSON_VALUE
)
public class ApplicationController {

    private final ApplicationServiceImpl applicationService;

    @Autowired
    public ApplicationController(final ApplicationServiceImpl applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping
    Optional<Application> getApplicationById(@RequestParam(name = "search", required = false) Integer search) {
        return applicationService.getApplicationById(search);
    }

    @GetMapping("all")
    List<Application> getApplications() {
        return applicationService.getAllApplications();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    Application create(@RequestBody Application application) {
        return applicationService.createApplication(application);
    }

    @PutMapping("/{id}")
    Application update(@RequestBody Application application) {
        return applicationService.updateApplication(application);
    }

    @DeleteMapping("/{id}")
    void remove(@PathVariable("id") int id) {
        applicationService.deleteApplication(id);
    }
}
