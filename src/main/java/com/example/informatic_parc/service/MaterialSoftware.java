package com.example.informatic_parc.service;

import com.example.informatic_parc.model.Material_Software;
import com.example.informatic_parc.repository.MaterialSoftwareRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class MaterialSoftware {
    private final MaterialSoftwareRepository repository;

    public Material_Software save(Material_Software toSave) {
        return repository.save(toSave);
    }

    public List<Material_Software> readAll() {
        return repository.findAll();
    }

    public List<Material_Software> findByMaterial(int id) {
        return repository.findMaterial_SoftwaresByMaterial(id);
    }

    public List<Material_Software> findBySoftware(int id) {
        return repository.findMaterial_SoftwaresBySoftware(id);
    }
}
