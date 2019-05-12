package ru.aryukov.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import ru.aryukov.sfgpetclinic.model.Pet;
import ru.aryukov.sfgpetclinic.services.PetService;

import java.util.Set;

/**
 * Created by oaryukov on 03.02.2019.
 */
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(), pet);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
