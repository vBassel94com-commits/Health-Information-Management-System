package com.example.healthinfosystem.repository;

import com.example.healthinfosystem.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
