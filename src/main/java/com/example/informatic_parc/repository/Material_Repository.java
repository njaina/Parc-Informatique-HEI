package com.example.informatic_parc.repository;

import com.example.informatic_parc.model.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Material_Repository extends JpaRepository<Material, Integer> {
}
