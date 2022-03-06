package liga.medical.medicalmonitoring.core.service;

import java.util.List;

public interface AbstractService<T> {
    T findById(Long id);

    List<T> getAll();

    void add(T element);

    void deleteById(Long id);

    void update(T element);
}

