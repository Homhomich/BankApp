package com.example.vsucs.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "clerks")
public class Clerk {
    @Id
    @SequenceGenerator(name="seq-gen",sequenceName="MY_SEQ_GEN", initialValue=4, allocationSize=12)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq-gen")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "salary")
    private Integer salary;

    @Column(name = "experience")
    private Integer experience;
}

