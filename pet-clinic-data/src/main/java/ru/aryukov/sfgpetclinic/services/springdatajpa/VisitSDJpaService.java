package ru.aryukov.sfgpetclinic.services.springdatajpa;

import org.springframework.stereotype.Service;
import ru.aryukov.sfgpetclinic.services.VisitService;
import ru.aryukov.sfgpetclinic.model.Visit;
import ru.aryukov.sfgpetclinic.repositories.VisitRepository;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by oaryukov on 11.02.2019.
 */
@Service
public class VisitSDJpaService implements VisitService{
    private final VisitRepository visitRepository;

    public VisitSDJpaService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Visit findById(Long id) {
        return visitRepository.findById(id).orElse(null);
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> resultSet = new HashSet<>();
        visitRepository.findAll().forEach(resultSet::add);
        return resultSet;
    }

    @Override
    public Visit save(Visit visit) {
        return visitRepository.save(visit);
    }

    @Override
    public void delete(Visit visit) {
        visitRepository.delete(visit);
    }

    @Override
    public void deleteById(Long id) {
        visitRepository.deleteById(id);
    }
}
