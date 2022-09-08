package com.example.informatic_parc.repository;

import com.example.informatic_parc.model.Network_Types;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Network_Types_Repository extends JpaRepository<Network_Types,Integer> {
}
