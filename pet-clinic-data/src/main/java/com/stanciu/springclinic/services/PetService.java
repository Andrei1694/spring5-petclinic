package com.stanciu.springclinic.services;

import com.stanciu.springclinic.Model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
