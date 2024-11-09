package com.example.healthinfosystem.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String specialty;

    @OneToMany(mappedBy = "doctor")
    private List<Patient> patients;

    // Getters and Setters
}
