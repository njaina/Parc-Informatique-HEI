package com.example.informatic_parc.service;

import com.example.informatic_parc.model.Material;
import com.example.informatic_parc.repository.Material_Repository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class Material_Service {
    private final Material_Repository materialRepository;
    public List<Material> findAll (){
        return materialRepository.findAll();
    }
}
