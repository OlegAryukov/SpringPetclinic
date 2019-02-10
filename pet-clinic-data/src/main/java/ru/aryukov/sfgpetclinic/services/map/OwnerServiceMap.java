package ru.aryukov.sfgpetclinic.services.map;

import ru.aryukov.sfgpetclinic.model.Owner;
import ru.aryukov.sfgpetclinic.services.OwnerService;

import java.util.Set;

/**
 * Created by oaryukov on 03.02.2019.
 */
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Set<Owner> findAll(){
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public void delete(Owner owner){
        super.delete(owner);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lsatName) {
        return null;
    }
}
