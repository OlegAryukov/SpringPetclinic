package ru.aryukov.sfgpetclinic.services;

import ru.aryukov.sfgpetclinic.model.Owner;

/**
 * Created by oaryukov on 02.02.2019.
 */
public interface OwnerService extends CrudInterface<Owner, Long>{
    Owner findByLastName(String lsatName);

}
