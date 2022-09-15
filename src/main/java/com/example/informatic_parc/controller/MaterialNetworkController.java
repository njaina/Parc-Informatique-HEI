package com.example.informatic_parc.controller;

import com.example.informatic_parc.model.Material_Network;
import com.example.informatic_parc.service.MaterialNetwork;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@AllArgsConstructor
public class MaterialNetworkController {
    private final MaterialNetwork relation;

    @PostMapping("/relationMaterialNetwork")
    public Material_Network save(Material_Network toSave) {
        return relation.save(toSave);
    }

    @GetMapping("/relationMaterialNetwork")
    public List<Material_Network> getAll() {
        return relation.readAll();
    }

    @GetMapping("/relationMaterialNetwork/id/{id}")
    public Material_Network read(@PathVariable int id) {
        return relation.read(id);
    }

}
