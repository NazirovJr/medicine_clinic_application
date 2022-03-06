package liga.medical.medicalmonitoring.core.repository.impl;

import liga.medical.medicalmonitoring.dto.MedicalHistoryDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalHistoryDtoRepository extends JpaRepository<MedicalHistoryDto, Long> {

}
