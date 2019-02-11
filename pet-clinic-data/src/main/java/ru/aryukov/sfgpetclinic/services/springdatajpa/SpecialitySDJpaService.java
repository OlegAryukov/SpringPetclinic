package ru.aryukov.sfgpetclinic.services.springdatajpa;

import org.springframework.stereotype.Service;
import ru.aryukov.sfgpetclinic.services.SpecialityService;
import ru.aryukov.sfgpetclinic.model.Speciality;
import ru.aryukov.sfgpetclinic.repositories.SpecialityRepository;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by oaryukov on 11.02.2019.
 */
@Service
public class SpecialitySDJpaService implements SpecialityService{
    private final SpecialityRepository specialityRepository;

    public SpecialitySDJpaService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Speciality findById(Long id) {
        return specialityRepository.findById(id).orElse(null);
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> resultSet = new HashSet<>();
        specialityRepository.findAll().forEach(resultSet::add);
        return resultSet;
    }

    @Override
    public Speciality save(Speciality speciality) {
        return specialityRepository.save(speciality);
    }

    @Override
    public void delete(Speciality speciality) {
        specialityRepository.delete(speciality);
    }

    @Override
    public void deleteById(Long id) {
        specialityRepository.deleteById(id);
    }
}
