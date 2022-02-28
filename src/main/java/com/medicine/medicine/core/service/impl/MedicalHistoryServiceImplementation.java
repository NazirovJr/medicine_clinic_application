package com.medicine.medicine.core.service.impl;

import com.medicine.medicine.core.model.entity.MedicalHistory;
import com.medicine.medicine.core.service.MedicalHistoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalHistoryServiceImplementation implements MedicalHistoryService {

    @Override
    public MedicalHistory findById(Integer id) {
        return null;
    }

    @Override
    public List<MedicalHistory> getAll() {
        return null;
    }

    @Override
    public void add(MedicalHistory element) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void update(MedicalHistory element) {

    }
}
