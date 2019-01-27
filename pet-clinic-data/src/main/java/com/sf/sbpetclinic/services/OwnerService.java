package com.sf.sbpetclinic.services;

import com.sf.sbpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CRUDService<Owner,Long> {
    Owner findByLastName(String lastName);
}
