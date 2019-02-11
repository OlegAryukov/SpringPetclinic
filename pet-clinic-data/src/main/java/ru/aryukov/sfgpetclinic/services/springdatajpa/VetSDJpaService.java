package ru.aryukov.sfgpetclinic.services.springdatajpa;

import org.springframework.stereotype.Service;
import ru.aryukov.sfgpetclinic.model.Vet;
import ru.aryukov.sfgpetclinic.repositories.VetRepository;
import ru.aryukov.sfgpetclinic.services.VetService;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by oaryukov on 11.02.2019.
 */
@Service
public class VetSDJpaService implements VetService {

    private final VetRepository vetRepository;

    public VetSDJpaService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Vet findById(Long id) {
        return vetRepository.findById(id).orElse(null);
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> resultSet = new HashSet<>();
        vetRepository.findAll().forEach(resultSet::add);
        return resultSet;
    }

    @Override
    public Vet save(Vet vet) {
        return vetRepository.save(vet);
    }

    @Override
    public void delete(Vet vet) {
        vetRepository.delete(vet);
    }

    @Override
    public void deleteById(Long id) {
        vetRepository.deleteById(id);
    }
}
