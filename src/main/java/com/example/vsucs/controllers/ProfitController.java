package com.example.vsucs.controllers;

import com.example.vsucs.entities.Profit;
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
        path = "/bank/profits",
        produces = MediaType.APPLICATION_JSON_VALUE
)
public class ProfitController {

    private final ProfitServiceImpl profitService;

    @Autowired
    public ProfitController(final ProfitServiceImpl profitService) {
        this.profitService = profitService;
    }

    @GetMapping
    Optional<Profit> getProfitById(@RequestParam(name = "search", required = false) Integer search) {
        return profitService.getProfitById(search);
    }

    @GetMapping("/all")
    List<Profit> getProfits() {
        return profitService.getAllProfits();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    Profit create(@RequestBody Profit profit) {
        return profitService.createProfit(profit);
    }

    @PutMapping("/{id}")
    Profit update(@RequestBody Profit profit) {
        return profitService.updateProfit(profit);
    }

    @DeleteMapping("/{id}")
    void remove(@PathVariable("id") int id) {
        profitService.deleteProfit(id);
    }
}
