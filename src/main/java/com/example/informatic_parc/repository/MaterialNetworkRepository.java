package com.example.informatic_parc.repository;

import com.example.informatic_parc.model.Material_Network;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaterialNetworkRepository extends JpaRepository<Material_Network, Integer> {
    List<Material_Network> findMaterial_NetworksByMaterial(int id);
    List<Material_Network> findMaterial_NetworksByNetwork(int id);
}
