package com.example.vsucs.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "documents")
public class Document {
    @Id
    @SequenceGenerator(name="seq-gen",sequenceName="MY_SEQ_GEN", initialValue=4, allocationSize=12)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq-gen")
    private Long id;

    @Column(name = "passport_info")
    private String passportInfo;

    @Column(name = "registration")
    private String registration;

    @Column(name = "taxpayer_number")
    private String taxpayerNumber;

    @Column(name = "employment_history_number")
    private String employmentHistoryNumber;
}
