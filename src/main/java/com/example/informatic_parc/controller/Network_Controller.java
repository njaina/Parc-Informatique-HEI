package com.example.informatic_parc.controller;

import com.example.informatic_parc.model.Network;
import com.example.informatic_parc.service.Network_Service;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin

public class Network_Controller {
    private final Network_Service trafficService;
    @GetMapping("/traffics/")
    public List<Network> getAll(){
        return trafficService.findAll();
    }
}
