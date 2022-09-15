package com.example.informatic_parc.controller;

import com.example.informatic_parc.model.Material_Software;
import com.example.informatic_parc.service.MaterialSoftware;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@AllArgsConstructor
public class MaterialSoftwareController {
    private MaterialSoftware relation;

    @PostMapping("/relationMaterialSoftware")
    public Material_Software save(Material_Software toSave) {
        return relation.save(toSave);
    }

    @GetMapping("/relationMaterialSoftware")
    public List<Material_Software> read() {
        return relation.readAll();
    }

    @GetMapping("/relationMaterialSoftware/idMaterial/{id}")
    public List<Material_Software> findByMaterial(@PathVariable int id) {
        return relation.findByMaterial(id);
    }

    @GetMapping("/relationMaterialSoftware/idSoftware/{id}")
    public List<Material_Software> findBySoftware(@PathVariable int id) {
        return relation.findBySoftware(id);
    }
}
