package com.example.informatic_parc.service;

import com.example.informatic_parc.model.Material_Software;
import com.example.informatic_parc.repository.MaterialNetworkRepository;
import com.example.informatic_parc.repository.MaterialSoftwareRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MaterialSoftware {
    private MaterialSoftwareRepository repository;
    public List<Material_Software> readAll(){
        return repository.findAll();
    }
}
