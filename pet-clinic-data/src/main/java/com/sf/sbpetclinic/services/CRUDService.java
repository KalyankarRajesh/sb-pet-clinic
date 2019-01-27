package com.sf.sbpetclinic.services;



import java.util.Set;

public interface CRUDService<T,ID> {

    T findById(Long id);
    T save(T pet);
    Set<T> findAll();
    void delete(T object);
    void deleteById(ID id);
}
