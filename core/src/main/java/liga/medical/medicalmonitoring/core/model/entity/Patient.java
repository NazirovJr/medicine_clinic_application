package liga.medical.medicalmonitoring.core.model.entity;

import lombok.*;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "patient")
public class Patient {
    //  id, name, gender, age, city, address, birthdayDt,
    //  birthPlace, registration, passportSeries,
    //  passportNumber, phoneNumber, anotherDocument
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "age")
    private Integer age;

    @Column(name = "city")
    private String city;

    @Column(name = "address")
    private String address;

    @Column(name = "birthdayDt")
    private LocalDate birthdayDt;

    @Column(name = "birthPlace")
    private String birthPlace;

    @Column(name = "registration")
    private String registration;

    @Column(name = "passportSeries")
    private Integer passportSeries;

    @Column(name = "passportNumber")
    private Integer passportNumber;

    @Column(name = "phoneNumber")
    private Integer phoneNumber;

    @Column(name = "anotherDocument")
    private ArrayList<?> anotherDocument;
    // private String anotherDocument

}
