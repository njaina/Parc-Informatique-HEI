package com.example.informatic_parc.repository;

import com.example.informatic_parc.model.Material_Software;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MaterialSoftwareRepository extends JpaRepository<Material_Software, Integer> {
    List<Material_Software> findMaterial_SoftwaresByMaterial(Integer id);
    List<Material_Software> findMaterial_SoftwaresBySoftware(Integer id);
}