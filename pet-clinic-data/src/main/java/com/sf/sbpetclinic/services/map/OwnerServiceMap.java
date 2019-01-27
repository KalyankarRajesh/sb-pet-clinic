package com.sf.sbpetclinic.services.map;

import com.sf.sbpetclinic.model.Owner;
import com.sf.sbpetclinic.services.CRUDService;
import com.sf.sbpetclinic.services.map.AbstractMapService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements CRUDService<Owner,Long> {

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }
}
