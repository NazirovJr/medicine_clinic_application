package liga.medical.medicalmonitoring.core.controller.rest;

import liga.medical.medicalmonitoring.core.model.entity.Patient;
import com.medicine.medicine.core.service.impl.PatientServiceImplementation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospital/patient")
@RequiredArgsConstructor
public class PatientController {
    private PatientServiceImplementation patientService;

    @GetMapping("/")
    public List<Patient> getAll(){
        return patientService.getAll();
    }

    @GetMapping("/{id}")
    public Patient findPatient(@PathVariable("id") Integer id){
        if (patientService.findById(id) != null){
            return patientService.findById(id);
        }

        return null;
    }

    @PostMapping("/")
    public Patient addPatient(@RequestBody Patient patient){
        patientService.add(patient);
        return patient;
    }

    @PostMapping("/update")
    public Patient updatePatient(@RequestBody Patient patient){
        patientService.update(patient);
        return patientService.findById(patient.getId());
    }

    @DeleteMapping("/{id}")
    public Patient deletePatient(@PathVariable("id") Integer id){
        Patient patient = patientService.findById(id);

        if (patient == null){
            throw new RuntimeException("Patient with" + id + "not founded!");
        }
        patientService.deleteById(id);
        return patient;
    }
}
