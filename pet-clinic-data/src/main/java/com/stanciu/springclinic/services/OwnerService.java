package com.stanciu.springclinic.services;

import com.stanciu.springclinic.Model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();

}
