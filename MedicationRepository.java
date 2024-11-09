package com.example.healthinfosystem.repository;

import com.example.healthinfosystem.model.Medication;
import org.springframework.data.jpa.repository.JpaRepository;
public interface MedicationRepository extends JpaRepository<Medication, Long> {
}
