package com.stanciu.springclinic.services;

import com.stanciu.springclinic.Model.Owner;

import java.util.Set;

public interface CrudService<T,ID> {

    Set<T> findAll();
    T findById(ID id);
    T save(T object);
    void delete(T object);
    Owner deleteById(ID id);
}
