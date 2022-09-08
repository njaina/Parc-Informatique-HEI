package com.example.informatic_parc.controller;

import com.example.informatic_parc.model.Software;
import com.example.informatic_parc.service.Software_Service;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin

public class Software_Controller {
    private final Software_Service softwareService;
    @GetMapping("/software/")
    public List<Software> getAll(){
        return softwareService.getAll();
    }
}
