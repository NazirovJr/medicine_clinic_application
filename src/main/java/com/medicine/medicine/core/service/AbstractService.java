package com.medicine.medicine.core.service;

import java.util.List;

public interface AbstractService<T> {
    T findById(Integer id);

    List<T> getAll();

    void add(T element);

    void deleteById(Integer id);

    void update(T element);
}

