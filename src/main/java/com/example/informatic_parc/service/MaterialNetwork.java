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
    public List<Material_Network> readAll(){
        return repository.findAll();
    }
}
