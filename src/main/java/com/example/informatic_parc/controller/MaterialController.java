package com.example.informatic_parc.controller;

import com.example.informatic_parc.model.Material;
import com.example.informatic_parc.service.Material_Service;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor
@CrossOrigin

public class MaterialController {
    private final Material_Service service;

    @PostMapping("/materials")
    public Material post(@RequestBody Material material) {
        return service.create(material);
    }

    @GetMapping("/materials")
    public List<Material> readAll() {
        return service.readAll();
    }

    @GetMapping("/materials/id/{id}")
    public Material read(@PathVariable int id) {
        return service.read(id);
    }

    @PutMapping("/materials/update")
    public Material update(@RequestBody Material material) {
        return service.update(material);
    }

    @DeleteMapping("/delete/materials")
    public void deleteAll() {
        service.deleteAll();
    }

    @DeleteMapping("/delete/materials/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteById(id);
    }
}
