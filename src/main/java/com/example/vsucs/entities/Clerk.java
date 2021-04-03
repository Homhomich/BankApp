package com.example.vsucs.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "clerks")
public class Clerk {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "salary")
    private Integer salary;

    @Column(name = "experience")
    private Integer experience;

    @OneToMany(mappedBy = "clerk", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Application> applications;

    @OneToOne (optional=false, mappedBy="clerk")
    private Profit profit;
}

