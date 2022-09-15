package com.example.informatic_parc.controller;

import com.example.informatic_parc.model.Network;
import com.example.informatic_parc.service.Network_Service;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin

public class NetworkController {
    private final Network_Service service;

    @PostMapping("/network")
    public Network post(@RequestBody Network network) {
        return service.create(network);
    }

    @GetMapping("/network")
    public List<Network> readALl() {
        return service.readAll();
    }

    @GetMapping("/network/id/{id}")
    public Network read(@PathVariable int id) {
        return service.read(id);
    }

    /**
     * &#064;PatchMapping("/network/patchName/ public Network updateName(Network network){
     * return service.updateName(network);
     * }  &#064;PatchMapping("/network/patchType/ public Network updateType(Network network){
     * return service.updateType(network);
     * }
     **/
    @PutMapping("/network/update")
    public Network update(@RequestBody Network network) {
        return service.update(network);
    }

    @DeleteMapping("/delete/network")
    public String deleteAll() {
        return service.deleteAll();
    }

    @DeleteMapping("/delete/network/{id}")
    public String delete(@PathVariable Integer id) {
        return service.deleteById(id);
    }
}
