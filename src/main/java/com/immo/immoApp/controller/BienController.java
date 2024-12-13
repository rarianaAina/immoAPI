package com.immo.immoApp.controller;

import com.immo.immoApp.model.Biens;
import com.immo.immoApp.services.BienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/biens")
public class BienController {

    @Autowired
    private BienService service;

    @GetMapping
    public List<Biens> getBiens() {
        return service.getBiens();
    }

    @GetMapping("/{id}")
    public Biens getBiensByID(@PathVariable("id") String bienID) {
        return service.getBienByID(bienID);
    }

    @PostMapping
    public void addBiens(@RequestBody Biens bien) { // Utilisation de @RequestBody
        service.addBiens(bien);
    }

    @PutMapping
    public void updateBiens(@RequestBody Biens bien) {
        service.updateBiens(bien);
    }

    @DeleteMapping("/{id}")
    public void deleteBiens(@PathVariable("id") String bienID) {
        service.deleteBiens(bienID);
    }
}
