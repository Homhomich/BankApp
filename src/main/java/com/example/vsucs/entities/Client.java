package com.example.vsucs.entities;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "clients")
public class Client {
    @Id
    @SequenceGenerator(name="seq-gen",sequenceName="MY_SEQ_GEN", initialValue=4, allocationSize=12)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq-gen")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToOne (optional=false, cascade=CascadeType.ALL)
    @JoinColumn (name="document_id")
    private Document document;

    @OneToMany(mappedBy = "clientId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Application> applications;
}
