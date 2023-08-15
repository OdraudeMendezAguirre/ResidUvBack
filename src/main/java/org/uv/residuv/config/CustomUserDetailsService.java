/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.residuv.config;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.uv.residuv.entities.Alumno;
import org.uv.residuv.repositories.AuthRepo;

/**
 *
 * @author ashly
 */
@Service
public class CustomUserDetailsService implements UserDetailsService{
    @Autowired
    private AuthRepo usuarioRepositorio;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Alumno usuario = usuarioRepositorio.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Alumno no registrado con la matricula : " + username));
        Set<String> rol = new HashSet<>();
        		rol.add("Alumno");
        		
        return new User(usuario.getUsername(), usuario.getPassword(), mapearRoles(rol));
    }

    private Collection<? extends GrantedAuthority> mapearRoles(Set<String> roles) {
        return roles.stream().map(rol -> new SimpleGrantedAuthority(rol)).collect(Collectors.toList());
    }
}
