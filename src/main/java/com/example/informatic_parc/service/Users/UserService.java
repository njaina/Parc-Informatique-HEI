package com.example.informatic_parc.service.Users;

import com.example.informatic_parc.model.Users.Users;
import com.example.informatic_parc.repository.Users.Users_Repository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService implements UserDetailsService {
    private final Users_Repository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user =  repository.findUsersByUsername(username);
        return new UserDetailsPrincipal(user);
    }
    public Users addUser(Users user){
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        return repository.save(user);
    }
}
