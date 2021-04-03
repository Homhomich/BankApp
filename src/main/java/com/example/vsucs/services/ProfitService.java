package com.example.vsucs.services;

import com.example.vsucs.entities.Profit;

import java.util.List;

public interface ProfitService {
    Profit createProfit(Profit profit);
    void deleteProfit(long id);
    Profit updateProfit(Profit profit);
    Profit getProfitById(long id);
    List<Profit> getAllProfits ();
}
