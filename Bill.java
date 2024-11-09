package com.example.healthinfosystem.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long billId;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    private Double totalAmount;
    private Double insuranceCoverage;
    private Double patientShare;
    private Date billDate;
    private String paymentStatus;

    // Getters and setters
}

