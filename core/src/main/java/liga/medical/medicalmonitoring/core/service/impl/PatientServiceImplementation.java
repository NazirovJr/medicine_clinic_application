package liga.medical.medicalmonitoring.core.service.impl;

import com.medicine.medicine.core.model.entity.Patient;
import com.medicine.medicine.core.service.PatientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImplementation implements PatientService {


    @Override
    public Patient findById(Long id) {
        return null;
    }

    @Override
    public List<Patient> getAll() {
        return null;
    }

    @Override
    public void add(Patient element) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void update(Patient element) {

    }

}
