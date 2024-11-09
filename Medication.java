package com.example.healthinfosystem.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Medication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long medicationId;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    private String medicationName;
    private String dosage;
    private String frequency;
    private String prescribedBy;
    private Date startDate;
    private Date endDate;

    // Getters and setters
}
