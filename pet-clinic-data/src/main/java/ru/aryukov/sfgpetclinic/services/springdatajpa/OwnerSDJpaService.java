package ru.aryukov.sfgpetclinic.services.springdatajpa;

import org.springframework.stereotype.Service;
import ru.aryukov.sfgpetclinic.model.Owner;
import ru.aryukov.sfgpetclinic.repositories.OwnerRepository;
import ru.aryukov.sfgpetclinic.repositories.PetRepository;
import ru.aryukov.sfgpetclinic.repositories.PetTypeRepository;
import ru.aryukov.sfgpetclinic.services.OwnerService;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by oaryukov on 11.02.2019.
 */
@Service
public class OwnerSDJpaService implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;

    public OwnerSDJpaService(OwnerRepository ownerRepository, PetRepository petRepository, PetTypeRepository petTypeRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Owner findById(Long id) {
        return ownerRepository.findById(id).orElse(null);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> resultSet = new HashSet<>();
        ownerRepository.findAll().iterator().forEachRemaining(resultSet::add);
        return resultSet;
    }

    @Override
    public Owner save(Owner owner) {
        return ownerRepository.save(owner);
    }

    @Override
    public Owner findByLastName(String lsatName) {
        return ownerRepository.findByLastName(lsatName);
    }

    @Override
    public void delete(Owner owner) {
        ownerRepository.delete(owner);
    }

    @Override
    public void deleteById(Long id) {
        ownerRepository.deleteById(id);
    }
}
