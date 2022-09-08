package com.example.informatic_parc.repository;

import com.example.informatic_parc.model.Software;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Software_Repository extends JpaRepository<Software, Integer> {
}
