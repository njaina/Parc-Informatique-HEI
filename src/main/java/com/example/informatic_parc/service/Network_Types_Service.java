package com.example.informatic_parc.service;

import com.example.informatic_parc.repository.Network_Types_Repository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class Network_Types_Service {
    private final Network_Types_Repository network_typesRepository;
}
