package com.example.healthinfosystem.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appointmentId;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    private String doctorName;
    private Date appointmentDate;
    private String status;
    private String reason;

    // Getters and setters
}

