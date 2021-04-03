package com.example.vsucs.entities;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "applications")
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cost")
    private Integer cost;

    @Column(name = "status")
    private String status; //TODO enum

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "clerk_id")
    private Clerk clerk;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;
}

