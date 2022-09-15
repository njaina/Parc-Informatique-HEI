package com.example.informatic_parc.service;

import com.example.informatic_parc.model.Network;
import com.example.informatic_parc.repository.Network_Repository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class Network_Service {
    private final Network_Repository repository;

    public Network create(Network network) {
        return repository.save(network);
    }

    public List<Network> readAll() {
        return repository.findAll();
    }
    public Network read(int id){
        return repository.findById(id).get();
    }

    /**public Network updateName(Network currentNetwork) {
        Network Update = repository.findById(currentNetwork.getId()).get();
        Update.setName(Update.getName());
        return repository.save(Update);
    }

    public Network updateType(Network currentNetwork) {
        Network Update = repository.findById(currentNetwork.getId()).get();
        Update.setType(Update.getType());
        return repository.save(Update);
    }**/
    public Network update(Network currentNetwork){
        Network Update = repository.findById(currentNetwork.getId()).get();
        Update.setName(Update.getName());
        Update.setType(Update.getType());
        return Update;
    }
    public String deleteAll(){
        repository.deleteAll();
        return "The resource hase been deleted successfully";
    }
    public String deleteById(int id){
        repository.deleteById(id);
        return "The service number :"+id+", has been deleted successfully";
    }
}