/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.residuv.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.uv.residuv.entities.Contribucion;
import org.uv.residuv.repositories.ContribucionRepo;

/**
 *
 * @author ashly
 */
@RestController
@RequestMapping("/contribucion")
public class ContribucionController {
    @Autowired
    ContribucionRepo repo;
    
    @CrossOrigin(origins = "*")
    @PostMapping()
    public Contribucion postContribucion(@RequestBody Contribucion contri){
        return repo.save(contri);
    }
}
