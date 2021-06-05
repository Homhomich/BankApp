package com.example.vsucs.services;

import com.example.vsucs.entities.Profit;

import java.util.List;
import java.util.Optional;

public interface ProfitService {
    Profit createProfit(Profit profit);
    void deleteProfit(long id);
    Profit updateProfit(Profit profit);
    Optional<Profit> getProfitById(long id);
    List<Profit> getAllProfits ();
    Optional<Profit> getByClerkId(long clerkId);
}
