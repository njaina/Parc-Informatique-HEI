package com.example.informatic_parc.controller;

import com.example.informatic_parc.model.Material;
import com.example.informatic_parc.service.Material_Service;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin

public class Material_Controller {
    private final Material_Service materialService;
    @GetMapping("/materials/")
    public List<Material> getAll(){
        return materialService.findAll();
    }
}
