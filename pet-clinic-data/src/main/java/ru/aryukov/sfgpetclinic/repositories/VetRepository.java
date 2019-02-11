package ru.aryukov.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.aryukov.sfgpetclinic.model.Vet;

/**
 * Created by oaryukov on 11.02.2019.
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
