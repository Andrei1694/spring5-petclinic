package com.stanciu.springclinic.services;

import com.stanciu.springclinic.Model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
