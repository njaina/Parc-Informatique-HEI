package com.example.informatic_parc.service;

import com.example.informatic_parc.model.Software;
import com.example.informatic_parc.repository.Software_Repository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class Software_Service {
    private final Software_Repository softwareRepository;
    public List<Software> getAll(){
        return softwareRepository.findAll();
    }
}
