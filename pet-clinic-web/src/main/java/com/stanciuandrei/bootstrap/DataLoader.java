package com.stanciuandrei.bootstrap;

import com.stanciu.springclinic.services.OwnerService;
import com.stanciu.springclinic.services.map.OwnerMapService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
//    private final VetService vetService;

    public DataLoader() {
//        vetService = new VetServiceMap();
        ownerService = new OwnerMapService();
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
