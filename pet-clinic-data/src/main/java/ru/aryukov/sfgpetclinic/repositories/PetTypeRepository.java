package ru.aryukov.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.aryukov.sfgpetclinic.model.PetType;

/**
 * Created by oaryukov on 11.02.2019.
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
