package com.immo.immoApp.services;

import com.immo.immoApp.model.Biens;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BienService {

    List<Biens> biens = new ArrayList<>(Arrays.asList(new Biens("1","Maison",30000),new Biens("2","Villa",40000)));
    public List<Biens> getBiens() {
        return biens;
    }

    public Biens getBienByID(String bienID) {
        return biens.stream()
                .filter(b -> b.getBiensID().equals(bienID)) // Utilisation de .equals pour comparer les chaînes
                .findFirst()
                .orElse(null); // Utilisation de orElse pour éviter une exception si aucun résultat
    }

    public void addBiens(Biens bien) {
        biens.add(bien);
    }

    public void updateBiens(Biens bien) {
        int index=0;
        for(int i=0;i<biens.size();i++) {
            if(biens.get(i).getBiensID().equals(bien.getBiensID())){
                index = i;
            }
        }
        biens.set(index,bien);
    }

    public void deleteBiens(String bienID) {
        int index=0;
        for(int i=0;i<biens.size();i++) {
            if(biens.get(i).getBiensID().equals(bienID)){
                index = i;
            }
        }
        biens.remove(index);
    }
}
