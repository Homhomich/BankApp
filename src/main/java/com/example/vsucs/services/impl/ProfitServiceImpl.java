package com.example.vsucs.services.impl;

import com.example.vsucs.entities.Profit;
import com.example.vsucs.repositories.ProfitRepository;
import com.example.vsucs.services.ProfitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfitServiceImpl implements ProfitService {
    private ProfitRepository profitRepository;

    @Autowired
    public ProfitServiceImpl(ProfitRepository profitRepository){
        this.profitRepository = profitRepository;
    }

    @Override
    public Profit createProfit(Profit profit) {
        return profitRepository.saveAndFlush(profit);
    }

    @Override
    public void deleteProfit(long id) {
        profitRepository.deleteById(id);
    }

    @Override
    public Profit updateProfit(Profit profit) {
        return profitRepository.saveAndFlush(profit);
    }

    @Override
    public Optional<Profit> getProfitById(long id) {
        return profitRepository.findById(id);
    }

    @Override
    public List<Profit> getAllProfits() {
        return profitRepository.findAll();
    }
}
