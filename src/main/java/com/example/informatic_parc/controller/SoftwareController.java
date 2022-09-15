package com.example.informatic_parc.controller;

import com.example.informatic_parc.model.Software;
import com.example.informatic_parc.service.Software_Service;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin

public class SoftwareController {
    private final Software_Service service;

    @PostMapping("/software")
    public Software post(@RequestBody Software software) {
        return service.create(software);
    }

    @GetMapping("/software")
    public List<Software> getAll() {
        return service.readAll();
    }

    @GetMapping("/software/id/{id}")
    public Software get(@PathVariable int id) {
        return service.read(id);
    }

    @PutMapping("/software/update")
    public Software putSoftware(@RequestBody Software software) {
        return service.update(software);
    }

    @DeleteMapping("/delete/software")
    public String deleteAll() {
        return service.deleteALl();
    }

    @DeleteMapping("/delete/software/{id}")
    public String delete(@PathVariable int id) {
        return service.deleteById(id);
    }
}
