package com.example.informatic_parc.service;

import com.example.informatic_parc.model.Network;
import com.example.informatic_parc.repository.Network_Repository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class Network_Service {
    private final Network_Repository networkRepository;
    public List<Network> findAll(){
        return networkRepository.findAll();
    }
}