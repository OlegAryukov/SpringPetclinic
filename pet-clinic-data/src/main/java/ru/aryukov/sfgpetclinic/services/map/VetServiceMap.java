package ru.aryukov.sfgpetclinic.services.map;

import ru.aryukov.sfgpetclinic.model.Vet;
import ru.aryukov.sfgpetclinic.services.VetService;

import java.util.Set;

/**
 * Created by oaryukov on 03.02.2019.
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet.getId(), vet);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
