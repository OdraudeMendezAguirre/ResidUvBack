/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.residuv.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.uv.residuv.config.JWTAuthResonseDTO;
import org.uv.residuv.config.JwtTokenProvider;
import org.uv.residuv.dto.LoginDTO;
import org.uv.residuv.entities.Alumno;
import org.uv.residuv.repositories.AuthRepo;

/**
 *
 * @author ashly
 */
@RestController
@RequestMapping("/auth")
public class AuthController {
    
    @Autowired
    private AuthenticationManager authManager;
    
    @Autowired
    private AuthRepo authRepo;
    
    @Autowired
    private PasswordEncoder passwordEncoder;
    
    @Autowired
    private JwtTokenProvider jwtTokenProvider;
    
    @CrossOrigin(origins = "*")
    @PostMapping("/signin")
    public Alumno signin(@RequestBody Alumno alumno){
        if(authRepo.existsByUsername(alumno.getUsername())){
            return null;
        }
        
        alumno.setPassword(passwordEncoder.encode(alumno.getPassword()));
        return authRepo.save(alumno);
    }
    
    @CrossOrigin(origins = "*")
    @PostMapping("/login")
    public ResponseEntity<JWTAuthResonseDTO> login(@RequestBody LoginDTO dto){
        Authentication authentication = authManager.authenticate(new UsernamePasswordAuthenticationToken(dto.getUsernameOrEmail(), dto.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);

        //obtenemos el token del jwtTokenProvider
        String token = jwtTokenProvider.generarToken(authentication);
        int id=authRepo.findByUsername(dto.getUsernameOrEmail()).get().getId_alumno();

        return ResponseEntity.ok(new JWTAuthResonseDTO(token,id));
    }
}
