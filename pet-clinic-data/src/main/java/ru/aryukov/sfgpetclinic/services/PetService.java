package ru.aryukov.sfgpetclinic.services;

import ru.aryukov.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * Created by oaryukov on 02.02.2019.
 */
public interface PetService {
    Pet findByLastName(String lsatName);

    Pet findById(Long id);

    Set<Pet> findAll();

    Pet save(Pet owner);
}
