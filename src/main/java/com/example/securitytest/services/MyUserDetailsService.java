package com.example.securitytest.services;

import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        switch (username){
            case "username": return new User(
                    "username",
                    new BCryptPasswordEncoder().encode("password"), new ArrayList<>());
            default: return new User(
                    "pallagj",
                    new BCryptPasswordEncoder().encode("pallagj"), new ArrayList<>());
        }

    }
}
