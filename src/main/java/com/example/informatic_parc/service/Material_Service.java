package com.example.informatic_parc.service;

import com.example.informatic_parc.model.Material;
import com.example.informatic_parc.repository.Material_Repository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class Material_Service {
    private final Material_Repository repository;

    public Material create(Material material) {
        return repository.save(material);
    }

    public List<Material> readAll() {
        return repository.findAll();
    }

    public Material read(int id) {
        return repository.findById(id).get();
    }

    public Material update(Material currentMaterial) {
        Material Update = repository.findById(currentMaterial.getIdMaterial()).get();
        Update.setName(Update.getName());
        return repository.save(Update);
    }

    public String deleteAll() {
        repository.deleteAll();
        return "Delete all resource successfully";
    }

    public String deleteById(int id) {
        repository.deleteById(id);
        return "The material number :" + id + ", has been deleted successfully";
    }
}
