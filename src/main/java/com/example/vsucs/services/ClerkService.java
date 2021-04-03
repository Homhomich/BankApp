package com.example.vsucs.services;

import com.example.vsucs.entities.Clerk;

import java.util.List;

public interface ClerkService {
    Clerk createClerk(Clerk clerk);
    void deleteClerk(long id);
    Clerk updateClerk(Clerk clerk);
    Clerk getClerkById(long id);
    List<Clerk> getAllClerks ();
}
