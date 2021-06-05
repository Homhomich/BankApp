package com.example.vsucs.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "profit")
public class Profit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "amount")
    private Integer amount;

    @JoinColumn(name = "clerk_id")
    private Long clerkId;

    public Profit(Integer amount, Long clerkId) {
        this.amount = amount;
        this.clerkId = clerkId;
    }

    public Profit() {
    }
}
