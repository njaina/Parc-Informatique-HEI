package com.example.informatic_parc.controller.Users;

import com.example.informatic_parc.model.Users.Roles;
import com.example.informatic_parc.service.Users.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class Roles_Controller {
    @Autowired
    RoleService service;
    @PostMapping("/newrole")
    public Roles addRole( @RequestBody Roles role){
        return service.addRole(role);
    }
}
