package liga.medical.medicalmonitoring.core.controller.rest;

import liga.medical.medicalmonitoring.core.model.entity.MedicalHistory;
import com.medicine.medicine.core.service.impl.MedicalHistoryServiceImplementation;
import com.medicine.medicine.core.service.impl.PatientServiceImplementation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospital/medical-history")
@RequiredArgsConstructor
public class MedicalHistoryController {

    private PatientServiceImplementation patientService;
    private MedicalHistoryServiceImplementation medicalHistoryService;

    @GetMapping("/")
    public List<MedicalHistory> getAll() {
        return medicalHistoryService.getAll();
    }

    @GetMapping("/{id}")
    public MedicalHistory findMedicalHistoryById(@PathVariable("id") Integer id) {
        if (medicalHistoryService.findById(id) != null) {
            return  medicalHistoryService.findById(id);
        }

        return null;
    }

    @PostMapping("/")
    public MedicalHistory addMedicalHistory(@RequestBody MedicalHistory medicalHistory) {
        if (patientService.findById(medicalHistory.getPatient().getId()) == null) {
            throw new RuntimeException("Patient not founded");
        }
        medicalHistoryService.add(medicalHistory);
        return medicalHistory;
    }

    @PostMapping("/update")
    public MedicalHistory updateMedicalHistory(@RequestBody MedicalHistory medicalHistory) {


        if (medicalHistoryService.findById(medicalHistory.getPatient().getId()) == null) {
            throw new RuntimeException("MedicalHistory not founded");
        }

        if (patientService.findById(medicalHistory.getPatient().getId()) == null) {
            throw new RuntimeException("Patient not founded");
        }


        medicalHistoryService.update(medicalHistory);
        return medicalHistory;
    }

    @DeleteMapping("/{id}")
    public MedicalHistory deleteById(@PathVariable("id") Integer id) {
        MedicalHistory medicalHistory = medicalHistoryService.findById(id);
        if (medicalHistory == null) {
            throw new RuntimeException("MedicalHistory not founded");
        }

        medicalHistoryService.deleteById(id);
        return medicalHistory;
    }

}
