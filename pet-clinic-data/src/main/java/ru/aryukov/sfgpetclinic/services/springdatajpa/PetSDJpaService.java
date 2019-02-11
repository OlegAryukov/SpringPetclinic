package ru.aryukov.sfgpetclinic.services.springdatajpa;

import org.springframework.stereotype.Service;
import ru.aryukov.sfgpetclinic.model.Pet;
import ru.aryukov.sfgpetclinic.repositories.PetRepository;
import ru.aryukov.sfgpetclinic.services.PetService;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by oaryukov on 11.02.2019.
 */
@Service
public class PetSDJpaService implements PetService {

    private final PetRepository petRepository;

    public PetSDJpaService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Pet findById(Long id) {
        return petRepository.findById(id).orElse(null);
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> resultSet = new HashSet<>();
        petRepository.findAll().forEach(resultSet::add);
        return resultSet;
    }

    @Override
    public Pet save(Pet pet) {
        return petRepository.save(pet);
    }

    @Override
    public void delete(Pet pet) {
        petRepository.delete(pet);
    }

    @Override
    public void deleteById(Long id) {
        petRepository.deleteById(id);
    }
}
