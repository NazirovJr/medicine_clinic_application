package com.medicine.medicine.core.repository.impl;

import com.medicine.medicine.core.model.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}