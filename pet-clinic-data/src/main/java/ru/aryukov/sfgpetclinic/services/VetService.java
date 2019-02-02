package ru.aryukov.sfgpetclinic.services;

import ru.aryukov.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by oaryukov on 02.02.2019.
 */
public interface VetService {

    Vet findByLastName(String lsatName);

    Vet findById(Long id);

    Set<Vet> findAll();

    Vet save(Vet owner);
}
