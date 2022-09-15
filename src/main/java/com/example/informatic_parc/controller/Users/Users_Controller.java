package com.example.informatic_parc.controller.Users;

import com.example.informatic_parc.model.Users.Users;
import com.example.informatic_parc.service.Users.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class Users_Controller {
    @Autowired
    UserService service;
    @PostMapping("/newuser")
    public Users addUser( @RequestBody Users user){
        return service.addUser(user);
    }
}
