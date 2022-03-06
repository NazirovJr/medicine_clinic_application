package liga.medical.medicalmonitoring.core.model.entity;

import lombok.*;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "medicalHistory")
public class MedicalHistory {
    //id, patient, docNubmer,
    // createDttm, modifyDttm,
    // doctor, diagnosis, medicalHistory


    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToMany
    @Column(name = "patient")
    @ToString.Exclude
    private Patient patient;

    @Column(name = "docNumber")
    private Integer docNumber;

    @Column(name = "createDttm")
    private LocalDate createDttm;

    @Column(name = "modifyDttm")
    private LocalDate modifyDttm;

    @Column(name = "doctor")
    private String doctor;

    @Column(name = "diagnosis")
    private ArrayList<String> diagnosis;

    @OneToOne
    @JoinColumn(name = "medicalHistory")
    private MedicalHistory medicalHistory;
}
