package com.immo.immoApp.services;

import com.immo.immoApp.model.Biens;
import com.immo.immoApp.repository.BiensRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BienService {

    @Autowired
    BiensRepo biensRepo;

    public List<Biens> getBiens() {
        return biensRepo.findAll();
    }

    public Biens getBienByID(String bienID) {
        return biensRepo.findById(bienID).orElse(null);
    }


    public void addBiens(Biens bien) {
        biensRepo.save(bien);
    }

    public void updateBiens(Biens bien) {
        biensRepo.save(bien);
    }

    public void deleteBiens(String bienID) {
        biensRepo.deleteById(bienID);
    }
}
