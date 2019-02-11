package ru.aryukov.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.aryukov.sfgpetclinic.model.Owner;

/**
 * Created by oaryukov on 11.02.2019.
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastNme);
}
