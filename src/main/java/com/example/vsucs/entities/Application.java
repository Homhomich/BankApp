package com.example.vsucs.entities;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "applications")
public class Application {
    @Id
    @SequenceGenerator(name="seq-gen",sequenceName="MY_SEQ_GEN", initialValue=4, allocationSize=12)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq-gen")
    private Long id;

    @Column(name = "cost")
    private Integer cost;

    @Column(name = "status")
    private String status;

    @JoinColumn(name = "clerk_id")
    private Long clerkId;

    @JoinColumn(name = "client_id")
    private Long clientId;
}

