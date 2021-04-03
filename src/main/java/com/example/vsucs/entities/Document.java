package com.example.vsucs.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "documents")
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "passport_info")
    private String passportInfo;

    @Column(name = "registration")
    private String registration;

    @Column(name = "taxpayer_number")
    private String taxpayerNumber;

    @Column(name = "employment_history_number")
    private String employmentHistoryNumber;

    @OneToOne (optional=false, mappedBy="document")
    private Client client;
}
