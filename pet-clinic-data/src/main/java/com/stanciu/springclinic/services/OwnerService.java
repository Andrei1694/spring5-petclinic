package com.stanciu.springclinic.services;

import com.stanciu.springclinic.Model.Owner;

public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);


}
