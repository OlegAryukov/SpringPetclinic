package ru.aryukov.sfgpetclinic.services;

import java.util.Set;

/**
 * Created by oaryukov on 03.02.2019.
 */
public interface CrudInterface<T, ID> {

    T findById(Long id);

    Set<T> findAll();

    T save(T owner);

    void delete(T object);

    void deleteById(ID id);
}
