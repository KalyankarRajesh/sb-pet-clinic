package com.sf.sbpetclinic.bootstrap;

import com.sf.sbpetclinic.model.Owner;
import com.sf.sbpetclinic.model.Vet;
import com.sf.sbpetclinic.services.OwnerService;
import com.sf.sbpetclinic.services.VetService;
import com.sf.sbpetclinic.services.map.OwnerServiceMap;
import com.sf.sbpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
private final OwnerService ownerService;
private final VetService vetService;

    public DataLoader() {
        this.ownerService = new OwnerServiceMap();
        this.vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Rajesh");
        owner1.setLastName("Kalyankar");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Kishore");
        owner2.setLastName("Kalyankar");

        ownerService.save(owner2);


        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Ramu");
        vet1.setLastName("Mandala");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Deepak");
        vet2.setLastName("Tomar");

        vetService.save(vet2);
    }
}
