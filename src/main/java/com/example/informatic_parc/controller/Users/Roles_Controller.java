package com.example.informatic_parc.controller.Users;

import com.example.informatic_parc.model.Users.Roles;
import com.example.informatic_parc.service.Users.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class Roles_Controller {
    private RoleService service;
    @PostMapping("/new-role")
    public Roles addRole( @RequestBody Roles role){
        return service.addRole(role);
    }
}
