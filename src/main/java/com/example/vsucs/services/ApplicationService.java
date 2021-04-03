package com.example.vsucs.services;

import com.example.vsucs.entities.Application;
import java.util.List;
import java.util.Optional;

public interface ApplicationService {
    Application createApplication(Application application);
    void deleteApplication(long id);
    Optional<Application> getApplicationById(long id);
    Application updateApplication(Application application);
    List<Application> getAllApplications ();
}
