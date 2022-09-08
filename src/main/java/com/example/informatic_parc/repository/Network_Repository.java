package com.example.informatic_parc.repository;

import com.example.informatic_parc.model.Network;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Network_Repository extends JpaRepository<Network, Integer> {
}
