/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.residuv.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.uv.residuv.entities.Residuo;
import org.uv.residuv.repositories.ResiduoRepo;

/**
 *
 * @author ashly
 */
@RestController
@RequestMapping("/residuos")
public class ResiduoController {
    @Autowired
    ResiduoRepo repo;
    
    @CrossOrigin(origins = "*")
    @GetMapping()
    public List<Residuo> getResiduos(){
        return repo.findAll();
    }
}
