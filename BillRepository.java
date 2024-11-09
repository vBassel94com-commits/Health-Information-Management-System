package com.example.healthinfosystem.repository;

import com.example.healthinfosystem.model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BillRepository extends JpaRepository<Bill, Long> {
}
