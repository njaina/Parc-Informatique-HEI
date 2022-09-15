package com.example.informatic_parc.service;

import com.example.informatic_parc.model.Material_Network;
import com.example.informatic_parc.repository.MaterialNetworkRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class MaterialNetwork {
    private MaterialNetworkRepository repository;

    public Material_Network save(Material_Network toSave) {
        return repository.save(toSave);
    }

    public List<Material_Network> readAll() {
        return repository.findAll();
    }

    public Material_Network read(int id) {
        return repository.findById(id).get();
    }

    private List<Material_Network> finByMaterial(int id) {
        return repository.findMaterial_NetworksByMaterial(id);
    }

    private List<Material_Network> findByNetwork(int id) {
        return repository.findMaterial_NetworksByNetwork(id);
    }
}
