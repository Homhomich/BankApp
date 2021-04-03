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

    @OneToOne (optional=false, cascade=CascadeType.ALL)
    @JoinColumn (name="clerk_id")
    private Clerk clerk;
}
