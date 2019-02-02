package ru.aryukov.sfgpetclinic.services;

import ru.aryukov.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * Created by oaryukov on 02.02.2019.
 */
public interface OwnerService {
    Owner findByLastName(String lsatName);

    Owner findById(Long id);

    Set<Owner> findAll();

    Owner save(Owner owner);
}
