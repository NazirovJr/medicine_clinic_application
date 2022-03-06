package liga.medical.medicalmonitoring.core.repository.impl;

import liga.medical.medicalmonitoring.dto.PatientDto;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface PatientDtoRepository extends JpaRepository<PatientDto, Long> {

}
