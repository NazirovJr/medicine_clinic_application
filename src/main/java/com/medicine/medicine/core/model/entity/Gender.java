package com.medicine.medicine.core.model.entity;

import lombok.*;
import org.springframework.data.util.ProxyUtils;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Gender")
public class Gender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "gender")
    private String gender;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || ProxyUtils.getUserClass(this) != ProxyUtils.getUserClass(o))
            return false;
        Gender gender = (Gender) o;
        return id != 0 && Objects.equals(id, gender.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
