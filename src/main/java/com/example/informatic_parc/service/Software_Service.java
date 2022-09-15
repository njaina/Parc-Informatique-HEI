package com.example.informatic_parc.service;

import com.example.informatic_parc.model.Software;
import com.example.informatic_parc.repository.Software_Repository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class Software_Service {
    private final Software_Repository repository;

    public Software create (Software software){
        return repository.save(software);
    }
    public List<Software> readAll() {
        return repository.findAll();
    }
    public Software read(int id){
        return  repository.findById(id).get();
    }
    public Software update(Software currentSoftware){
        Software Update = repository.findById(currentSoftware.getId()).get();
        Update.setName(Update.getName());
        return Update;
    }
    public String deleteALl(){
        repository.deleteAll();
        return "Deleted all ressources with success";
    }
    public String deleteById(int id){
        repository.deleteById(id);
        return "The entity number :" +id+ ",has been deleted successfully";
    }
}
